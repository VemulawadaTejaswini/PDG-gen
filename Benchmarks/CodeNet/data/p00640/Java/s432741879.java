import java.io.*;
import java.util.*;

class Button {
    int ulx, uly, lrx, lry;
    public String linkName;
    Button(int ulx, int uly, int lrx, int lry, String linkName) {
        this.ulx = ulx;
        this.uly = uly;
        this.lrx = lrx;
        this.lry = lry;
        this.linkName = linkName;
    }
    boolean contains(int x, int y) {
        //System.out.printf("%d,%d\n", x, y);
        //System.out.println(ulx + " " +  lrx + " " + lry + " " + uly);
        return (ulx <= x && x <= lrx && uly <= y && y <= lry);
    }
}

class Page {
    public String name;
    public Button[] links;
    Page(String name, Button[] links) {
        this.name = name;
        this.links = links;
    }
    String getLinkPageName(int x, int y) {
        for (Button b : links) {
            if (b.contains(x, y)) {
                return b.linkName;
            }
        }
        return name;
    }
}

public class Main {
    int n, W, H;
    Scanner sc;
    HashMap<String, Page> pages;
    Main() {
        sc = new Scanner(System.in);
    }
    Page first;
    boolean init() {
        n = sc.nextInt();
        if (n == 0) return false;
        W = sc.nextInt();
        H = sc.nextInt();
        pages = new HashMap<String, Page>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int b = sc.nextInt();
            Button[] links = new Button[b];
            for (int j = 0; j < b; j++) {
                int ulx = sc.nextInt();
                int uly = sc.nextInt();
                int lrx = sc.nextInt();
                int lry = sc.nextInt();
                String linkName = sc.next();
                links[j] = new Button(ulx, uly, lrx, lry, linkName);
            }
            Page page = new Page(name, links);
            if (i == 0) first = page;
            pages.put(name, page);
        }
        return true;
    }
    void run() {
        while (init()) {
            ArrayList<Page> history = new ArrayList<Page>();
            history.add(first);
            int current = 0;
            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                String cmd = sc.next();
                if (cmd.equals("click")) {
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    Page curPage = history.get(current);
                    Page nextPage = pages.get(curPage.getLinkPageName(x, y));
                    if (curPage != nextPage) {
                        while (history.size() != current+1) {
                            history.remove(current+1);
                        }
                        //history.removeRange(current, history.size());
                        history.add(pages.get(curPage.getLinkPageName(x, y)));
                        current++;
                    }
                } else if (cmd.equals("show")) {
                    System.out.println(history.get(current).name);
                } else if (cmd.equals("back")) {
                    if (current > 0) current--;
                } else if (cmd.equals("forward")) {
                    if (current < history.size()-1) current++;
                }
            }
        }
    }
    public static void main(String[] args) {
        new Main().run();
    }
}
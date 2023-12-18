import java.awt.Rectangle;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) throws java.io.IOException {
        // TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            sc.nextInt();
            sc.nextInt();
            Page pages[] = new Page[n];
            LinkedList<Page> buffer = new LinkedList<Page>();
            Map<String, Integer> index = new HashMap<String, Integer>();
            // ページの作成
            for (int i = 0; i < n; i++) {
                String pagename = sc.next();
                int b = sc.nextInt();
                index.put(pagename, i);
                pages[i] = new Page(pagename, b);
                for (int j = 0; j < b; j++) {
                    int x1 = sc.nextInt();
                    int y1 = sc.nextInt();
                    int x2 = sc.nextInt();
                    int y2 = sc.nextInt();
                    String linkname = sc.next();
                    pages[i].mkBottan(j, x1, y1, x2, y2, linkname);
                }
            }
            buffer.add(pages[0]);
            int it = 0;
            int ord_num = sc.nextInt();
            for (int i = 0; i < ord_num; i++) {
                String ordname = sc.next();
                if (ordname.equals("click")) {
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    String linkedplace = pages[it].pageClicked(x, y);

                    if (!linkedplace.equals(pages[it].getPageName())) {
                        int next = index.get(linkedplace);
                        int size = buffer.size();
                        for (int j = it + 1; j <size; j++) {
                            buffer.remove(j);
                           
                        }
                        buffer.add(pages[next]);
                        it++;
                    }

                } else if (ordname.equals("back")) {
                    if (it != 0)
                        it--;
                } else if (ordname.equals("forward")) {
                    if (it != buffer.size() - 1)
                        it++;
                } else if (ordname.equals("show")) {
                    System.out.println(buffer.get(it).getPageName());
                }
            }

        }
    }
}

class Page {
    private String pagename;
    private Bottan[] bottans;
    private int bottan_number;

    Page(String pagename, int b) {
        this.pagename = pagename;
        this.bottan_number = b;
        bottans = new Bottan[b];
    }

    void mkBottan(int bnum, int x1, int y1, int x2, int y2, String linkname) {
        bottans[bnum] = new Bottan(x1, y1, x2, y2, linkname);
    }

    String pageClicked(int x, int y) {
        String jump = this.pagename;
        for (int i = 0; i < bottan_number; i++) {
            if (bottans[i].isInBottan(x, y)) {
                jump = bottans[i].getLinkName();
                break;
            }
        }
        return jump;
    }

    String getPageName() {
        return pagename;
    }
}

class Bottan {
    private String linkname;
    private Rectangle bottan;

    Bottan(int x1, int y1, int x2, int y2, String linkname) {
        this.linkname = linkname;
        bottan = new Rectangle(x1, y1, x2 - x1 + 1, y2 - y1 + 1);
    }

    boolean isInBottan(int x, int y) {
        return bottan.contains(x, y);
    }

    String getLinkName() {
        return linkname;
    }
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String tl[][] = new String[n][2];

        ArrayList<Integer> slist = new ArrayList<>();
        ArrayList<Integer> hlist = new ArrayList<>();
        ArrayList<Integer> clist = new ArrayList<>();
        ArrayList<Integer> dlist = new ArrayList<>();

        if (n <= 52) {
            for (int i = 0; i < n; i++) {
                tl[i][0] = sc.next();
                tl[i][1] = sc.next();
            }

            for (int i = 0; i < n; i++) {
                if ("S".equals(tl[i][0])) {
                    for (int j = 1; j <= 13; j++) {
                        if (tl[i][1].equals(String.valueOf(j))) {
                            slist.add(j);
                        }
                    }
                } else if ("H".equals(tl[i][0])) {
                    for (int j = 1; j <= 13; j++) {
                        if (tl[i][1].equals(String.valueOf(j))) {
                            hlist.add(j);
                        }
                    }
                } else if ("C".equals(tl[i][0])) {
                    for (int j = 1; j <= 13; j++) {
                        if (tl[i][1].equals(String.valueOf(j))) {
                            clist.add(j);
                        }
                    }
                } else if ("D".equals(tl[i][0])) {
                    for (int j = 1; j <= 13; j++) {
                        if (tl[i][1].equals(String.valueOf(j))) {
                            dlist.add(j);
                        }
                    }
                }
            }
            Collections.sort(slist);
            Collections.sort(hlist);
            Collections.sort(clist);
            Collections.sort(dlist);
            
        }
        
        for (int k=1; k<=13; k++) {
            if (slist.indexOf(k) == -1) {
                System.out.println("S "+k);
            } 
        }
        for (int k=1; k<=13; k++) {
            if (hlist.indexOf(k) == -1) {
                System.out.println("H "+k);
            } 
        }
        for (int k=1; k<=13; k++) {
            if (clist.indexOf(k) == -1) {
                System.out.println("C "+k);
            } 
        }
        for (int k=1; k<=13; k++) {
            if (dlist.indexOf(k) == -1) {
                System.out.println("D "+k);
            } 
        }
    }
}
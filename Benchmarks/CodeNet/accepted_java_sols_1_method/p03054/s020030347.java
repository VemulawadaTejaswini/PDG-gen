import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        String S = sc.nextLine();
        String T = sc.nextLine();
        String[] f = first.split(" ");
        String[] sec = second.split(" ");
        int srow = Integer.parseInt(sec[0]);
        int scol = Integer.parseInt(sec[1]);
        int H = Integer.parseInt(f[0]);
        int W = Integer.parseInt(f[1]);
        int N = Integer.parseInt(f[2]);
        // System.out.println(W);
        // System.out.println(T);
        int maxH = H;
        int minH = 1;
        int maxW = W;
        int minW = 1;
        boolean ans = true;
        for (int i = N-1; i>=0; i--) {
            //aoki
            char aoki = T.charAt(i);
            switch(aoki) {
                case 'L':
                    maxW = Math.min(W,maxW+1);
                    break;
                case 'R':
                    minW = Math.max(1,minW-1);
                    break;
                case 'U':
                    maxH = Math.min(H,maxH+1);
                    break;
                case 'D':
                    minH = Math.max(1,minH-1);
                    break;
            }

            //takahashi
            char takahashi = S.charAt(i);
            switch(takahashi) {
                case 'L':
                    minW = minW+1;
                    break;
                case 'R':
                    maxW = maxW-1;
                    break;
                case 'U':
                    minH = minH+1;
                    break;
                case 'D':
                    maxH = maxH-1;
                    break;
            }
            if (minW > maxW || minH > maxH) {
                //maxH <= H, maxW <= W, minH >= 1, minW >= 1 after aoki
                ans = false;
                break;
            }
        //     System.out.print(minW);
        //     System.out.print(" ");
        //     System.out.print(maxW);
        //     System.out.print(" ");
        //     System.out.print(minH);
        //     System.out.print(" ");
        //     System.out.print(maxH);
        //     System.out.println(" ");
        //     System.out.println("--------- ");
        }
        if(!ans) {
            System.out.println("NO");
        } else {
            ans = (srow >= minH) && (srow <= maxH) && (scol >= minW) && (scol <= maxW);
            if (ans) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }



    }
}
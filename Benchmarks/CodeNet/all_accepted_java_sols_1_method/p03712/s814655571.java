import java.util.*;
public class Main {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        char [][] list = new char[H+2][W+2];
        for(int i=0;i<H+2;i++)for(int j=0;j<W+2;j++)list[i][j]='#';
        for(int i=1;i<=H;i++){
            String a = sc.next();
            for(int j=0;j<W;j++) list[i][j+1]=a.charAt(j);
        }
        for(int i=0;i<H+2;i++){
            for(int j=0;j<W+2;j++) System.out.print(list[i][j]);
            System.out.println();
        }
    }
}

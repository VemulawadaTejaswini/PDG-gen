import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        int[][] c = new int[h][w];
        int black = 0;
        for (int i=0;i<h;i++){
            String s = sc.next();
            for (int j=0;j<w;j++){
                if (s.charAt(j)=='.'){
                    c[i][j]=0;
                }else {
                    c[i][j]=1;
                    black++;
                }
            }
        }
        int count = 0;
        for (int i=0;i<Math.pow(2,h);i++){
            String s = Integer.toBinaryString(i);
            while (s.length()<h)s="0"+s;
            for (int j=0;j<Math.pow(2,w);j++){
                String t = Integer.toBinaryString(j);
                while (t.length()<w)t="0"+t;
                int def = black;
                for (int a=0;a<h;a++){
                    for (int b=0;b<w;b++){
                        if ((s.charAt(a)=='1'||t.charAt(b)=='1')&&c[a][b]==1)def--;
                    }
                }
                if (def==k)count++;
            }
        }
        System.out.println(count);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e=sc.nextInt(),y=sc.nextInt();
        int[] l= {1911,1925,1988,2016};
        int[] f= {1868,1912,1926,1989};
        char[] g= {'M','T','S','H'};
        if(e==0) {
            for(int i=0;i<4;i++) {
                if(y<=l[i]) {
                    System.out.println(g[i]+""+((y-f[i])+1));
                    break;
                }
            }
        }else {
            System.out.println(y+f[e-1]-1);
        }
    }
}

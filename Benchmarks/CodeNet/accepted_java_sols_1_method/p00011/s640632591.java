import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int w,n;
        w = scan.nextInt();
        n = scan.nextInt();
        int[] x = new int[w];
        for(int i=0;i<w;i++){
            x[i]=i+1;
        }
        String str;
        String[] num = new String[2];
        int a,b;
        a=0;
        b=0;
        for(int i=0;i<n;i++){
            str = scan.next();
            num =  str.split(",",0);
            a = Integer.parseInt(num[0]);
            b = Integer.parseInt(num[1]);
            a--;
            b--;
            int c = x[a];
            x[a]=x[b];
            x[b]=c;
        }
        for(int i=0;i<w;i++){
            System.out.println(x[i]);
        }
    }
}

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt();
        int n = scan.nextInt();
        int[] ab = new int[w+1];
        for(int i=1;i<=w;i++)ab[i]=i;
        for(int i=0;i<n;i++){
            String s = scan.next();
            String[] x = s.split(",");
            int aa = Integer.parseInt(x[0]);
            int bb = Integer.parseInt(x[1]);
            int t = ab[aa];
            ab[aa] = ab[bb];
            ab[bb]=t;
        }
        for(int i=1;i<=w;i++){
            System.out.println(ab[i]);
        }
    }
}

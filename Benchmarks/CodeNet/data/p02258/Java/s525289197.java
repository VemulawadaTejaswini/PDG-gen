import java.util.Scanner;

public class Main {
    private static Scanner sc=new Scanner(System.in);
    private static final int MINF=-1000000000;
    public static void main(String[] args){
        int n=sc.nextInt();
        int[] r=new int[n];
        for(int i=0;i<n;i++) r[i]=sc.nextInt();
        int max=MINF;
        int maxp=MINF;
        for(int i=n-2;i>=0;i--){
            max=Math.max(max,r[i+1]);
            maxp=Math.max(maxp,max-r[i]);
        }
        System.out.println(maxp);
    }
}
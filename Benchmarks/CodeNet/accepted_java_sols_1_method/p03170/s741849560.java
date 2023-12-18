import java.util.*;
public class Main {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int k=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       a[i]=sc.nextInt();
       boolean[] win = new boolean[k + 1];
        for (int i = 1; i <= k; i++) {
         for (int x : a) {
            win[i] |= x <= i && !win[i - x];
            }
        }
    System.out.println(win[k] ? "First" : "Second");
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        if(k%2==0)System.out.println((long)(n/k)*(n/k)*(n/k)+(long)((n+k/2)/k)*((n+k/2)/k)*((n+k/2)/k));
        else System.out.println((long)(n/k)*(n/k)*(n/k));
    }
}

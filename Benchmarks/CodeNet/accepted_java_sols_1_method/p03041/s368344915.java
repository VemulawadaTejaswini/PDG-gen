import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        n=sc.nextInt();
        char[] a=sc.next().toCharArray();
        for(int i=0;i<a.length;i++)
        System.out.print((i+1==n)?(char)((int)a[i]+32):a[i]);
        System.out.println();
    }
}

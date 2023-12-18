import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=i+1;
        for(int i=0;i<m;i++){
            String s=sc.next();
            int k=0;
            //System.out.println(s);
            String[] t=s.split(",");
            int aa=Integer.parseInt(t[0]);
            int bb=Integer.parseInt(t[1]);
            aa--;
            bb--;
            int tmp=a[aa];
            a[aa]=a[bb];
            a[bb]=tmp;
        }
        for(int i=0;i<n;i++)System.out.println(a[i]);
    }
}

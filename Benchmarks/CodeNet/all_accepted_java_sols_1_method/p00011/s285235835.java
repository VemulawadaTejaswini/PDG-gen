import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h =sc.nextInt();
        int a[] = new int[w];
        for(int i=0;i<a.length;i++){
            a[i]=i+1;
        }
        int l,m,n;
        for(int i=0;i<h;i++){
            String s= sc.next();
            String[] s1 =s.split(",");
            l = Integer.parseInt(s1[0])-1;
            m = Integer.parseInt(s1[1])-1;
            n = a[l];
            a[l]=a[m];
            a[m]=n;
        }
        for(int i=0;i<w;i++){
            System.out.println(a[i]);
        }
        sc.close();
    }
}

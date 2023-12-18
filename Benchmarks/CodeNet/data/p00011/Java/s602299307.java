import java.util.*;
public class Main{
    public static int swap(int a,int b){
        int n;
        n=a;
        a=b;
        b=n;
        return 0;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        int []x =new int [n];
        for(int j=0;j<x.length;j++){
			x[j]=j+1;
        }
        m=sc.nextInt();
        for(int i=0;i<m;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            swap(x[a],x[b]);
        }

        for(int k=0;k<x.length;k++){
        System.out.print(x[k]);
    }
    System.out.printf("\n");
    }
}

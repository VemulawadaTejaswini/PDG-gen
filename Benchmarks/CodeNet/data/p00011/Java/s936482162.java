import java.util.Scanner;
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
            String h =sc.next();
            String []s = h.split(",");
            int a =Integer.parseInt(s[0]);
            int b =Integer.parseInt(s[1]);
            swap(x[a],x[b]);
        }

        for(int k=0;k<x.length;k++){
        System.out.println(x[k]);
    }
}
}


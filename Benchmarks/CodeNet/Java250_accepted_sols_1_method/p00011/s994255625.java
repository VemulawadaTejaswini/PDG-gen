import java.util.Scanner;
public class Main{
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
            int a =Integer.parseInt(s[0])-1;
            int b =Integer.parseInt(s[1])-1;
            int p;
            p=x[a];
            x[a]=x[b];
            x[b]=p;

        }

        for(int k=0;k<n;k++){
        System.out.println(x[k]);
    }
}
}


import java.util.Scanner;

public class Main{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        while(true){
            String s=sc.next();
            if(s.equals("-"))break;
            int N=s.length();
            int m=sc.nextInt();
            for(int i=0;i<m;i++){
                int n=sc.nextInt();
                String x=s.substring(0,n);
                String y=s.substring(n,N);
                s=y+x;
            }
            System.out.println(s);
        }
    }
}

import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        double d=s.nextInt();
        int count=0;

        for(int i=0;i<n;i++){
            long x=s.nextInt();
            x=x*x;
            long y=s.nextInt();
            y=y*y;
            long p=x+y;
            double dist=Math.sqrt(p);
            if(dist<=d){
                count++;
            }
        }

        System.out.println(count);

    }
}
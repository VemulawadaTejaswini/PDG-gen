import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int h=0,w=0,n=0;
        if(scan.hasNext())
            h=scan.nextInt();
        if(scan.hasNext())
            w=scan.nextInt();
        if(scan.hasNext())
            n=scan.nextInt();
        int max=Math.max(h,w);
        double d=n/((double)max);
        if(d==(int)d){
            System.out.println((int)d);
        }else{
            System.out.println((int)d + 1);
        }
    }
}

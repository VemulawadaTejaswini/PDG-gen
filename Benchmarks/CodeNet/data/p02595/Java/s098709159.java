import java.util.*;

class Main{
    public static void main(String args[]){
        int n,x,y,count=0;
        double d;
        Scanner sc=new Scanner(System.in);

        n=sc.nextInt();
        d=sc.nextInt();
        for(int i=0;i<n;i++){
            x=sc.nextInt();
            y=sc.nextInt();
            double d_i=Math.sqrt((x*x)+(y*y));
            if(d>=d_i)count++;
        }
        System.out.println(count);
    }

}
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(true){
            double x=sc.nextDouble();
            double h=sc.nextDouble();
            if(x==0&&h==0){
                break;
            }
            double sum=x*x;
            double hh=Math.sqrt((x/2)*(x/2)+h*h);
            sum+=(x*hh/2)*4;
            System.out.println(sum);
        }
    }
}

import java.util.*;
 
class Main{

    void run(){
        Scanner sc=new Scanner(System.in);
        
        while(true){
            int z=sc.nextInt();if(z==-1)break;
            double q=(double)z;
            double x=q/2;
            
            while(true){
                if(Math.abs(x*x*x-q)<0.00001*q)break;
                x=x-(x*x*x-q)/(3*x*x);
                //System.out.println(x);
            }
            
            System.out.printf("%.6f\n",x);
        }
    }
    
    public static void main(String[] args){
        new Main().run();
    }
}
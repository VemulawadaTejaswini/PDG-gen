import java.util.*;
 
class Main{
    
    double EPS=1e-8;
 
    void run(){
        Scanner sc=new Scanner(System.in);
        
        while(true){
            int z=sc.nextInt();if(z==-1)break;
            double q=(double)z;
            double x=q/2;
            
            while(true){
                if(Math.abs(x*x*x-q)+EPS<0.00001*q)break;
                x=x-(x*x*x-q)/(3*x*x);
                //System.out.println(x);
            }
            
            System.out.println(x);
        }
    }
    
    public static void main(String[] args){
        new Main().run();
    }
}
import java.util.Scanner;
class Main{
    public static void main(String[] args){
  
            Scanner scan = new Scanner(System.in);
  
            double r =  scan.nextDouble();
            double s,l,p = 3.141592653589;
          
            s = r*r*p;
            l = 2*r*p;
  
           System.out.printf("%f %f\n",s,l);
        }
}
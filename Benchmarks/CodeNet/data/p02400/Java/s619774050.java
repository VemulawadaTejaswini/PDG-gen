import java.util.Scanner;
class Main{
    public static void main(String[] args){

            Scanner scan = new Scanner(System.in);

            double r =  scan.nextDouble();
            double s,l;
        
            s = r*r*3.14;
            l = 2*r*3.14;

           System.out.println(s+" "+l);
        }
}
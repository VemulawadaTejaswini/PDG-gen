import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double x1=scan.nextDouble();
        double y1=scan.nextDouble();
        double x2=scan.nextDouble();
        double y2=scan.nextDouble();
        double a=x1-x2;
        double b=y1-y2;
        double c=0;
        if(Math.abs(a)==0||Math.abs(b)==0){
            c=Math.abs(a)+Math.abs(b);
        }else{
            c=Math.sqrt(Math.abs(a-b));
        }
        System.out.println(c);
            scan.close();
        }
 
}

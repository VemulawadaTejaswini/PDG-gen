import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double x = sc.nextInt();
        double res;
        
        if(x>a*a*b/2){
            res = Math.toDegrees(Math.atan(a*a*a/(2*a*a*b-2*x)));
        }else{
            res = Math.toDegrees(Math.atan(2*x/(a*b*b)));
        }
        System.out.println(90-res);
	}
}
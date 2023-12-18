import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	double a = sc.nextDouble();
    	double b = sc.nextDouble();
    	int H = sc.nextInt();
    	int M = sc.nextInt();
    	sc.close();
    	double ans = 0;
    	double X = Math.abs((M * 6) - ((H * 30) + (M * 0.5)));
    	if(X > 180){
    		X = 360 - X;
    	}
    	double cos = Math.cos(Math.toRadians(X));
    	ans = a*a + b*b - 2 * a * b * cos;
    	System.out.println(Math.sqrt(ans));
    }
}
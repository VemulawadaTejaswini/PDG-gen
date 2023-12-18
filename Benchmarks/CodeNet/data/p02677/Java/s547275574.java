import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	int H = sc.nextInt();
    	int M = sc.nextInt();
    	sc.close();
    	double ans = 0;
    	double a = Math.pow(A, 2);
    	double b = Math.pow(B, 2);;
    	double X = Math.abs((M * 6) - ((H * 30) + (M * 0.5)));
    	if(X > 180){
    		X = 360 - X;
    	}
    	double cos = Math.cos(X);
    	ans = a + b - 2 * A * B * cos;
    	System.out.println(Math.sqrt(ans));
    }
}
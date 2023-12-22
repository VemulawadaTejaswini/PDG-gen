import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
    	Scanner sc = new Scanner(System.in);
//    	File file = new File("src/in.txt");
//    	Scanner sc = new Scanner(file);

    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	int H = sc.nextInt();
    	int M = sc.nextInt();

    	double radM = (double) (M*6.0);
    	double radH = (double) ((H*60+M)*0.5);

    	double rad = Math.abs(radM-radH);

    	double ans = Math.sqrt(A*A+B*B-2*A*B*Math.cos(rad/180*Math.PI));

    	System.out.println(ans);

    }
}
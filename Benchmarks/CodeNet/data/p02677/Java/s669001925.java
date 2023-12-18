import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	int B = sc.nextInt();
	int H = sc.nextInt();
	int M = sc.nextInt();
	int mi = H*60 + M; //分
	double kakuA = 0.5*mi;
	//System.out.println(kakuA);
	double kakuB = (6*mi)%360;
	//System.out.println(kakuB);
	double kaku = Math.abs(kakuA-kakuB);
	if(kaku > 180) kaku=360-kaku;
	//System.out.println(kaku);
	System.out.print( Math.sqrt(A*A + B*B + 2*A*B*Math.cos(Math.toRadians(kaku))) );
    }
}

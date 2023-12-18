import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double X = Math.floor(N/1.08);

		while(Math.floor((int)X*1.08)<=N){
			if(Math.floor((int)X*1.08)==N){
				System.out.println((int)X);
				return;
			}else{
				X++;
			}
		}
		System.out.println(":(");
    }
}

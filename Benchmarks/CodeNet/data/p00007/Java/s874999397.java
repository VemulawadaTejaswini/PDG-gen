import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 100000;	//100,000yen
		for(int i=0; i<n; i++){
			sum += Main.DeptMaker(sum);
		}
		System.out.println(sum);
	}
	private static int DeptMaker(int sum){
		int dept = (int) Math.ceil((sum * 0.05)/1000)*1000;
		return  dept;
	}
}
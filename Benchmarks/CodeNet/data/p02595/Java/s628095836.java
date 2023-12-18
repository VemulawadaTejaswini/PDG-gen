import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int n =scn.nextInt();
		double d =scn.nextDouble();
		int cnt=0;
		for(int i=0;i<n;i++){
			long val1 = scn.nextLong();
			long val2 =scn.nextLong();
			long val3 = (val1)*val1 +val2*val2;
			double res= Math.sqrt(val3);
			if(res<=d){
				cnt++;
			}
		}
		System.out.println(cnt);
		

	}

}
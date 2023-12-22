import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int b,Max=0,Min=0,sum0=0,sum=0;
			for(int i=0;i<N-1;i++) {
				if(i==0) {
					Min = sc.nextInt();
					Max = sc.nextInt();
					sum0 = Max - Min;
					if(Min > Max)
						Min = Max;
				}else{ // i != 0
					b = sc.nextInt();
					sum = b - Min;
						if(sum > sum0)
							sum0 = sum;
						if(b < Min)
							Min = b;
				}
			
			}
			System.out.println(sum0);
			sc.close();
	}

}

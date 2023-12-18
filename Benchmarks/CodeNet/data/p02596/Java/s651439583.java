import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int[] data = new int[K*111];
		int calc =0;
		int sum = 7;
		int kari =7;
		
		for(int i=0;i<K*111;i++) {
			data[i]=sum;
			kari = kari*10;
			sum = kari +sum;
		}
		
		
		for(int i=0;i<K*111;i++) {
			if(data[i]%K==0) {
				calc=i+1;
				
				break;
			}
		}
		
		if(0<calc) {
			System.out.println(calc);
		}else if(calc==0) {
			System.out.println(-1);
		}
	}

}
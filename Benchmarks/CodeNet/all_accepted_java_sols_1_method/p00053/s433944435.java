import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] v = new int[649900];
		for(int i = 0;i < 649900;i++){
			v[i] = 1;
		}
		int p = 3;
		while(true){
			if(p*p > 1299800){
				break;
			}else{
				if(v[(p-1)/2] == 0){
					p += 2;
				}else{
					int t = p*p;
					while(t < 1299800){
						v[(t-1)/2] = 0;
						t += 2*p;
					}
					p += 2;
				}
			}
		}
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			long sum = 2;
			for(int i = 1;i < 649900;i++){
				if(v[i] == 0){
					continue;
				}
				if(n < 2){
					break;
				}
				sum += (2*i+1);
				n--;
			}
			System.out.println(sum);
		}
	}
}
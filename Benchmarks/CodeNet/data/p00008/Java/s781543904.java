import java.util.*;

public class Main {
	public static void main(String[] args) {
		final int MAX = 9;
		Scanner sc = new Scanner(System.in);
		int[] data = new int [MAX*2+1];
		
		for(int i = 0; i <= MAX*2; i++){
			for(int k = 0; k <= i; k++){
				if (k <= MAX && (i-k)<= MAX){
					data[i]++;
				}
			}
		}
		
		while(sc.hasNext()){
			int n = 0;
			int in = sc.nextInt();
			if(in >= 0 && in <= MAX*4){
				for(int j = 0; j <= in; j++){
					if(j > MAX*2 || in-j > MAX*2){
						continue;
					}
					n += data[j] * data[in-j];
				}
			}
			System.out.println(n);
		}
	}
}
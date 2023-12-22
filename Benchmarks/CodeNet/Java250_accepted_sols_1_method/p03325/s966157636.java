import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力]
		int N = sc.nextInt();
		int[] number = new int[N];
		int[] times = new int[number.length];
		int sum = 0;
      
		for(int i=0; i<N; i++){
			number[i] = sc.nextInt();
			while(number[i]%2==0){
				number[i] /= 2;
				times[i]++;
			}
			sum += times[i];
        }
      	
		System.out.println(sum);
	}
}
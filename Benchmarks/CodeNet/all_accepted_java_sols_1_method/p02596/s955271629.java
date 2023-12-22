import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int sum = 7;
		int count = -1;
		for(int i = 0; i < 1000000; i ++){
			if(sum % K == 0){
				count = i + 1;
				break;
			}
			sum %= K;
			sum *= 10;
			sum += 7;
	}
	
	System.out.println(count);
}
}
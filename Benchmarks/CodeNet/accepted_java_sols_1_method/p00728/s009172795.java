
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(;;){
			int max = 0;
			int min = 1000;
			int answer = 0;
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			int [] array = new int[n];
			for(int i = 0; i < n; i++){
				array[i] = sc.nextInt();
			}
			for(int i = 0; i < n; i++){
				if(array[i] >= max){
					max = array[i];
				}
			}
			for(int i = 0; i < n; i++){
				if(array[i] <= min){
					min = array[i];
				}
			}
			for(int i = 0; i < n; i++){
				if(min == array[i]){
					array[i] = 0;
					break;
				}
			}
			for(int i = 0; i < n; i++){
				if(max == array[i]){
					array[i] = 0;
					break;
				}
			}
			for(int i = 0; i < n; i++){
				answer += array[i];
			}
			answer = answer / (n - 2);
			System.out.println(answer);
		}
	}

}
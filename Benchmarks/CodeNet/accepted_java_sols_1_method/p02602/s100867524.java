import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] test = new int[n];
		
		for(int i = 0; i < n; i++){
			test[i] = sc.nextInt();
		}
		
		for(int i = k; i < n; i++){
			if(test[i-k] < test[i]){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}
}

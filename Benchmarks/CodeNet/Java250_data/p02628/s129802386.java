import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] price = new int[n];
		for(int i = 0; i < n; i++){
			price[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
			for(int j = i; j < n; j++){
				if(price[i] > price[j]){
					int tmp = price[i];
					price[i] = price[j];
					price[j] = tmp;
				}
			}
		}
		int res = 0;
		for(int i = 0; i < k; i++){
			res += price[i];
		}
		System.out.println(res);
	}

}
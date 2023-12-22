import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int a = x.nextInt();
		int b = x.nextInt();
		int c = x.nextInt();
		int[] price = {a,b,c,0};
		for (int n = 3 ; n >= 0 ; n--){
		for (int i = 0 ; i < n ; i++){
			if(price[i] > price[i+1]){
				price[3] = price[i];
				price[i] = price[i+1];
				price[i+1] = price[3];
			}
		}
	 }
		System.out.println(price[0]+" " + price[1]+" " + price[2]);	
	}
}
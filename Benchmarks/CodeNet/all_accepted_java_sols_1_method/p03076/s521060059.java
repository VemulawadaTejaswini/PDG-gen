import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dish = new int[5];
		for(int i = 0; i < 5; i++){
			int d = sc.nextInt();
			dish[i] = d;
		}
		int minid = 0;
		int min = 10;
		for(int i = 0; i < 5; i++){
			if(dish[i]%10 != 0){	
				if(dish[i]%10 < min){
					min = dish[i]%10;
					minid = i;
				}
			}	
		}
		int sum = 0;
		for(int i = 0; i < 5; i++){
			if(i == minid){
				sum += dish[i];
			}else{
				sum += ((dish[i] + 9)/10*10);
			}
		}
		System.out.println(sum);
	}
}
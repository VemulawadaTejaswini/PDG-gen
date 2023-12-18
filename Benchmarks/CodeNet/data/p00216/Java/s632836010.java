import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int lMonth = 4280;
		while(scan.hasNext()){
			int water = scan.nextInt();
			if(water == -1){
				break;
			}
			int price = 1150;
			if(water > 30){
				price += 160 * water - 2150;
			}else if(water > 20){
				price += 140 * water - 1550;
			}else if(water > 10){
				price += 125 * (water - 10);
			}
			System.out.println(lMonth - price);
		}
	}
}
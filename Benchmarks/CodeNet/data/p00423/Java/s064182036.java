import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		int cardA, asum;
		int cardB, bsum;
		n = sc.nextInt();
		while(n != 0){

			asum = 0;
			bsum = 0;
			for(int i = 0; i < n; i++){
				cardA = sc.nextInt();
				cardB = sc.nextInt();
				if(cardA > cardB){
					asum += cardA + cardB;
					
				}else if(cardA < cardB){
					bsum += cardA + cardB;

				}else{
					asum = cardA;
					bsum = cardB;
				}
			}
			System.out.println(asum + " " + bsum);
			n = sc.nextInt();
		}
	}
}
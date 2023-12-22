
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int aScore = 0;
		int bScore = 0;
		for(int i = 0; i < n; i++){
			String aCard = sc.next();
			String bCard = sc.next();
			int conp = aCard.compareTo(bCard);
			if(conp == 0){
				aScore += 1;
				bScore += 1;
			}else {
				if(conp > 0){
					aScore += 3;
				}else{
					bScore += 3;
				}
			}
		}
		System.out.println(aScore + " " + bScore);
	}
}


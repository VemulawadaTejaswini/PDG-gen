import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			int TaroPoint = 0;
			int HanakoPoint = 0;

			for(int i = 0;i < n;i++) {
				String TaroCard = sc.next();
				String HanakoCard = sc.next();

				if(TaroCard.compareTo(HanakoCard) > 0) {
					TaroPoint +=3;
				}else if(HanakoCard.compareTo(TaroCard) > 0){
					HanakoPoint +=3;
				}else {
					TaroPoint ++;
					HanakoPoint ++;
				}
			}
			System.out.println(TaroPoint+" "+HanakoPoint);
		}

	}
}

import java.util.Scanner;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int Hanako_Point = 0;
		int Taro_Point = 0;
		int n = sc.nextInt();

		for(int i = 0; i< n; i++){
			String Taro_Card = sc.next();
			String Hanako_Card = sc.next();

			if(Taro_Card.compareToIgnoreCase(Hanako_Card) < 0){
				Hanako_Point += 3;
			}else if(Taro_Card.compareToIgnoreCase(Hanako_Card) == 0){
				Taro_Point ++;
				Hanako_Point++;
			}else{
				Taro_Point += 3;
			}
		}
		System.out.println(Taro_Point + " " + Hanako_Point);
	}
}

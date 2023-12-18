import java.util.*;
 
class Main{
    public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int cnt = 0;
		int taro = 0;
		int hanako = 0;
		while(cnt < n){
			String card1 = scan.next();
			String card2 = scan.next();

			if(card1.compareTo(card2) > 0){
				taro += 3;
			}
			else if(card1.compareTo(card2) < 0){
				hanako += 3;
			}
			else{
				taro += 1;
				hanako += 1;
			}
			cnt++;
		}
		System.out.println(taro + " " + hanako);
    }
}
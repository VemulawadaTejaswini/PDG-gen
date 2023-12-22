import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int i, num, place; 
		String front, back; 
		while(true){
			String str = sc.next();
			if(str.equals("-")){
				break;
			}
			num = sc.nextInt();
			for(i=0; i<num; i++){
				place = sc.nextInt();
				back = str.substring(place);
				front = str.substring(0, place);
				str = back + front;
			}
			System.out.println(str);
		}
	}
}

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner seer = new Scanner(System.in);
		int s = seer.nextInt();
		int a = s / 100;
		int b = s % 100;
		if(a == 0 && b == 0){
			System.out.println("NA");
		}
		else if(a == 0 && b > 12){
			System.out.println("NA");
		}
		else if(b == 0 && a > 12){
			System.out.println("NA");
		}
		else if(a > 12 && b > 12){
			System.out.println("NA");
		}
		else{
			if(a <= 12 && (b > 12 || b == 0)){
				System.out.println("MMYY");
			}
			else if((a > 12 || a == 0) && b <= 12){
				System.out.println("YYMM");
			}
			else{
				System.out.println("AMBIGUOUS");
			}
		}
	}

}

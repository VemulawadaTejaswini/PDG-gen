import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine()); //total
		boolean flg = false;
		loop:for(int a=0; a<=25; a++){
			for(int b=0; b<=14; b++){
				if((4*a + 7*b) == N){
					flg = true;
					System.out.println("Yes");
					break loop;
				}
			}
		}
		if(!flg) System.out.println("No");
	}
}
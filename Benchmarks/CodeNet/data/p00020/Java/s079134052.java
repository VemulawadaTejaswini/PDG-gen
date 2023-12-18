import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] str = sc.nextLine().split("[\\s]");
		
		boolean first_flag = false;
		
		for(String tmp:str){
			if(!first_flag){
				System.out.print(tmp.toUpperCase());
				first_flag = true;
			}
			else {
				System.out.print(" "+tmp.toUpperCase());
			}
		}
		System.out.println();
	}
}
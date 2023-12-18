import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str =sc.nextLine();
		int count = 0;

		for(int i = 0 ;i<str.length();i++){
			if(str.charAt(i)=='o'){
				count++;

			}

		}

		int check = 0;
		boolean lastcount =false ;
		check = 15 - str.length();

		if( check + count>=8){
			lastcount = true;
		}

		if(lastcount){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}
}
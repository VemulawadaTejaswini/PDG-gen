import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true){
			String str1 = stdIn.nextLine();
			if(str1.equals("END OF INPUT")){
				return;
			}
			String[] str2 = str1.split(" ");
			for(int i=0;i<str2.length;i++){
				System.out.print(str2[i].length());
			}
			System.out.println();
		}
	}
}
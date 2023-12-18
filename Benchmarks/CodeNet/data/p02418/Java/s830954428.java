import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str=new String();
		String p = new String();

		 str = scan.nextLine();
		 p =  scan.nextLine();
		 str = str+str;
				
				if(str.lastIndexOf(p)==-1){
					System.out.println("No");
				}else{
					System.out.println("Yes");
				}

	}
}
import java.util.Scanner; 
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		for(int i = 0 ; i < str.length();i++){
			if(str.charAt(i)<68)
				System.out.print((char)(str.charAt(i)+23));
			else
				System.out.print((char)(str.charAt(i)-3));
		}
	}
}
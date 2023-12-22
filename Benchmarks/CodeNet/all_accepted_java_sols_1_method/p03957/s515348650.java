import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.indexOf("C") == -1){
			System.out.println("No");
		}else{
			if(s.indexOf("F") >= 0 && s.substring(s.indexOf("C")+1).indexOf("F") >= 0 ){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}

	}

}

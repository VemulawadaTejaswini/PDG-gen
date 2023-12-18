import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
	    Integer A = scanner.nextInt();
	    Integer B = scanner.nextInt();
	    Integer C = scanner.nextInt();
	    
	    Integer suma = A + B;
	    Integer sumb = A + C;
	    Integer sumc = B + C;
	    
	    if(suma<sumb) {
	    	if(suma<sumc) {
	    		System.out.println(suma);
	    	}else {
	    		System.out.println(sumc);
	    	}
	    }else if (sumb<sumc) {
			System.out.println(sumb);
		}else {
			System.out.println(sumc);
		}

	}

}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		String b = sc.next();
		String ret = "";

		if(b.equals("A")){
			ret = "T";
		}else if(b.equals("T")){
			ret = "A";
		}else if(b.equals("C")){
			ret = "G";
		}else{
			ret = "C";
		}

		System.out.println(ret);

		sc.close();
	}
}

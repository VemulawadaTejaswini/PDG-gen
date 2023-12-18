import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	int a = sc.nextInt();

	int b = sc.nextInt();

	int c = sc.nextInt();

		if (a < b) {
		
		
		if (b < c) { println(a + " " + b + " " + c);

		 } else if (a < c) { println(a + " " + c + " " + b);

		 }else{ println(c + " " + a + " " + b);

		}


} else if (a < c) {println(b + " " + a + " " + c); 

}else if(b < c) {println(b + " " + c + " " + a);

}else{ println(c + " " + b + " " + a);

}


}
}
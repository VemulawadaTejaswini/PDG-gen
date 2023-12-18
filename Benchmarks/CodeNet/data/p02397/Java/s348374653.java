import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //??\???????¨????
		
		while(true){ //????????????????????????
			 int x = sc.nextInt();
			 int y = sc.nextInt();
			 if(x < y || x == y){
				 System.out.println(x + " " + y);
			 }else
			 {
				 System.out.println(y + " " + x);
			 }
			 if(x == 0 && y == 0){
				 break;
			 }

	}
	}
}
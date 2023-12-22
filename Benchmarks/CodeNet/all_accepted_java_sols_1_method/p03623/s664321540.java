import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		int x=reader.nextInt();
		int a=reader.nextInt();
		int b=reader.nextInt();
		if(Math.abs(x-a)>=Math.abs(x-b)) {
			System.out.print("B");
		}
		else {
			System.out.print("A");
		}
 	}

}

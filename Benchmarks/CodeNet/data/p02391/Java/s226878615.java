import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		src.useDelimiter("?\?\s");
		int a = src.nextInt();
		int b = src.nextInt();
		
		
		if(a < b){
		System.out.println(a+" < "+b);
		}
		if(b < a){
			System.out.println(a+" >"+b);
		}
		if(a == b){
			System.out.println(a+" == "+b);
		}
	}

}
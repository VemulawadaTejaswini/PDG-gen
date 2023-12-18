import java.util.*;

class Main {

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int w=0, k=0;
		for(int i=0; i<10; i++) w += in.nextInt();
		for(int i=0; i<10; i++) k += in.nextInt();
		System.out.println(w + " " + k);
	}
	
}
import java.util.Scanner;


public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	boolean t = false;
	int N = sc.nextInt();
	for(int i=0;i < N;i++){
		String co = sc.next();
		if(co.equalsIgnoreCase("Y"))
			t = true;
	}
	
	if(t == false){
		System.out.println("Three");
	}else{
		System.out.println("Four");
	}
}
}

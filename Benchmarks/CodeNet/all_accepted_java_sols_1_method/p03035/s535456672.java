import java.util.*;
public class Main{

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	int B = sc.nextInt();

	if(A < 6){
		System.out.println(0);
		
	}
	else if (A < 13){
		System.out.println(B/2);
	}
	else{
		System.out.println(B);
	}
}	
}
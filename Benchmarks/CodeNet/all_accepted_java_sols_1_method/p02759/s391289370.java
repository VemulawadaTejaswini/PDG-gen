import java.util.*;
public class Main {
	public static void main(String[] args){
      	
		Scanner sc = new Scanner(System.in);
		//String word_before = sc.next();
		//int K = sc.nextInt();
		
		int N = sc.nextInt();
		//int arr[] = new int[N];
		if (N%2==1) {
			System.out.println(N/2+1);
		} else {
			System.out.println(N/2);
		}
		
		
      	sc.close();
    }
		
		
}

import java.util.*;
public class Main {
	public static void main(String[] args){
      	
		Scanner sc = new Scanner(System.in);
		//String word_before = sc.next();
		//int K = sc.nextInt();
		
		int N = sc.nextInt();
		int R = sc.nextInt();
		
		if (N>=10) {
			System.out.println(R);
		}else{
			System.out.println(R+(10-N)*100);
		}

      	sc.close();
    }
		
		
}
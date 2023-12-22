import java.util.*;
public class Main {
	public static void main(String[] args){
      	
		Scanner sc = new Scanner(System.in);
		//String word_before = sc.next();
		//int K = sc.nextInt();
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		
		for (int i = 1; i < 10000; i++) {
			boolean Aj = A <= (double)i*0.08 && (double)i*0.08 < A+1;
			boolean Bj = B <= (double)i*0.10 && (double)i*0.10 < B+1;
			if (Aj && Bj) {
				System.out.println(i);
				sc.close();
				return;
			}
		}



		System.out.println(-1);
		


      	sc.close();
    }
		
		
}
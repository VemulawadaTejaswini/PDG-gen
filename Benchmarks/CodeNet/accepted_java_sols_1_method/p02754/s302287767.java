import java.util.*;
public class Main {
	public static void main(String[] args){
      	
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long A = sc.nextLong(); //blue
		long B = sc.nextLong(); //red
		if (A==0||(A==0&&B==0)) {
			System.out.println(0);
			sc.close();
			return;
		}else{
			long kosu = 0;
			kosu =N/(A+B)*A;
			if(N%(A+B)<=A){
				System.out.println(kosu+(N%(A+B)));
			}else{
				System.out.println(kosu+A);
			}

		}

      	sc.close();
    }
		
		
}
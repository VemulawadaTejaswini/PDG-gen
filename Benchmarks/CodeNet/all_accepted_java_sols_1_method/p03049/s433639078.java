
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			String[] S = new String[N];

			for(int i = 0 ; i < N ; i++){
				S[i] = sc.next();
			}


		sc.close();

		int result = 0;
		int count = 0;
		int Acount = 0;
		int Bcount = 0;
		int ABcount = 0;

		for(int i = 0 ; i < N ; i++){

			if(S[i].substring(0, 1).equals("B") && !S[i].substring(S[i].length()-1, S[i].length()).equals("A")){
				Bcount++;
			}
			if(!S[i].substring(0, 1).equals("B") &&S[i].substring(S[i].length()-1, S[i].length()).equals("A")){
				Acount++;
			}
			if(S[i].substring(0, 1).equals("B") && S[i].substring(S[i].length()-1, S[i].length()).equals("A")){
				ABcount++;
			}



	        for (int j = 0; j < S[i].length(); j++) {
	            result = S[i].indexOf("AB", j);
	            if (result != -1) {
	                count++;
	                j = result;
	            }
	        }
		}

		if(ABcount == 0){
			System.out.println(Math.min(Acount, Bcount)+count);
		}
		else if(Acount + Bcount > 0){
			System.out.println(ABcount + Math.min(Acount, Bcount)+count);
		}
		else if(Acount + Bcount == 0){
			System.out.println(count+ABcount-1);
		}

	}
}
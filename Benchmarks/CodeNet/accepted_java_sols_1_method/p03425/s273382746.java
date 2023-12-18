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



		int tmp = N;
		long M = 0;
		long A = 0;
		long R = 0;
		long C = 0;
		long H = 0;

		for(int i = 0 ; i < N ; i++){
			if(!S[i].substring(0, 1).equals("M") && !S[i].substring(0, 1).equals("A") && !S[i].substring(0, 1).equals("R") && !S[i].substring(0, 1).equals("C") && !S[i].substring(0, 1).equals("H")){
				tmp--;
			}
			else if(S[i].substring(0, 1).equals("M")){
				M++;
			}
			else if(S[i].substring(0, 1).equals("A")){
				A++;
			}
			else if(S[i].substring(0, 1).equals("R")){
				R++;
			}
			else if(S[i].substring(0, 1).equals("C")){
				C++;
			}
			else if(S[i].substring(0, 1).equals("H")){
				H++;
			}
		}

		if(tmp == 0){
			System.out.println("0");
		}
		else{
			long[] T = {M,A,R,C,H};

			long ans = 0;
			for(int i = 0 ; i < 5 ; i++){
				for(int j = i+1 ; j < 5 ; j++){
					for(int k = j+1 ; k < 5 ; k++){
						ans += (T[i]*T[j]*T[k]);
					}
				}
			}

			System.out.println(ans);
		}

	}
}
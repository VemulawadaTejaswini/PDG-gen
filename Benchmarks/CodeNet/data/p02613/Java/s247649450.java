import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		String[] S = new String[N]; 
		String[] conc = {"AC", "WA", "TLE", "RE"};
      	for(int k = 0; k < N; k++){
          S[k] = sc.nextLine();
        }
		
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < N; j++){
				if(S[j].equals(conc[i])){
					cnt++;
					System.out.println(conc[i]+"×"+cnt);
				}
			}
			cnt = 0;
		}
	}
}

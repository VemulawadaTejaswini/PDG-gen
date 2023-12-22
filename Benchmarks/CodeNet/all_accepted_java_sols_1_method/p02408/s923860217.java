

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException{

		boolean[] S = new boolean[14];
		boolean[] H = new boolean[14];
		boolean[] C = new boolean[14];
		boolean[] D = new boolean[14];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int num = Integer.parseInt(input);
		int n=0;

		for(int i = 0;i<num;i++){


			String[] rank = br.readLine().split(" ");

			n=Integer.parseInt(rank[1]);

			switch(rank[0]){
			case "S":
				S[n]=true;
				break;
			case "H":
				H[n]=true;
				break;
			case "C":
				C[n]=true;
				break;
			case "D":
				D[n]=true;
				break;
			}


		}

		for(int i=1;i<14;i++){
			if(S[i]==false){
				System.out.println("S "+i);
			}
		}
		for(int i=1;i<14;i++){
			if(H[i]==false){
				System.out.println("H "+i);
			}
		}
		for(int i=1;i<14;i++){
			if(C[i]==false){
				System.out.println("C "+i);
			}
		}
		for(int i=1;i<14;i++){
			if(D[i]==false){
				System.out.println("D "+i);
			}
		}
	}

}
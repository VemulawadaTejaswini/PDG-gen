import java.io.*;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String[] cards;
		int n = Integer.parseInt(buf.readLine());
		int num;
		boolean[] S = new boolean[13];
		boolean[] H = new boolean[13];
		boolean[] C = new boolean[13];
		boolean[] D = new boolean[13];

		for(int i=0; i<13; i++){
			S[i] = H[i] = C[i] = D[i] = false;
		}

		for(int i=0; i<n; i++){
			cards = buf.readLine().split(" ");
			num = Integer.parseInt(cards[1]);
			if(cards[0].equals("S"))
				S[num-1] = true;
			else if(cards[0].equals("H"))
				H[num-1] = true;
			else if(cards[0].equals("C"))
				C[num-1] = true;
			else if(cards[0].equals("D"))
				D[num-1] = true;
		}
		for(int i=0; i<13; i++){
			if(S[i] == false)
				System.out.println("S " + (i+1));
		}
		for(int i=0; i< 13; i++){
			if(H[i] == false)
				System.out.println("H " + (i+1));
		}
		for(int i=0; i<13; i++){
			if(C[i] == false)
				System.out.println("C " + (i+1));
		}
		for(int i= 0; i<13; i++){
			if(D[i] == false)
			System.out.println("D " + (i+1));
		}
		
	}
}
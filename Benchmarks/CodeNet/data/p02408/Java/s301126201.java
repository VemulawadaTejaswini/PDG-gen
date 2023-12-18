import java.util.*;

public class Main{

	static void Missing(int[] S,int[] H,int[] C,int[] D){
		
		for(int i = 0; i < 13 ; i++){
			if(S[i] == 0){
				System.out.println("S "+(i+1));
			}
		}
		for(int i = 0; i < 13 ; i++){
			if(H[i] == 0){
				System.out.println("H "+(i+1));
			}
		}
		for(int i = 0; i < 13 ; i++){
			if(C[i] == 0){
				System.out.println("C "+(i+1));
			}
		}
		for(int i = 0; i < 13 ; i++){
			if(D[i] == 0){
				System.out.println("D "+(i+1));
			}
		}
		
	}
	
	static void Input(){
		Scanner scanner = new Scanner(System.in);
		int N	= scanner.nextInt();
		int[] S = new int[13];
		int[] H = new int[13];
		int[] C = new int[13];
		int[] D = new int[13];
		for(int i = 0; i < N ; i++){
			String 	gara = scanner.next();
			int 	kazu = scanner.nextInt();
			switch(gara){
			case "S":S[kazu-1]=1; break;
			case "H":H[kazu-1]=1; break;
			case "C":C[kazu-1]=1; break;
			case "D":D[kazu-1]=1; break;
			}
		}
		Missing(S, H, C, D);
		scanner.close();
	}
	
	public static void main(String[] args) {
		Input();
		
	}

}
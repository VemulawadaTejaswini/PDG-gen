import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int S[] =new int[13];
		int C[] =new int[13];
		int D[] =new int[13];
		int H[] =new int[13];
		int a=0;
		for(int i = 0;i<N;i++){
			switch(sc.next()){
			case "S":
				a=sc.nextInt();
				S[a-1] = 1;
				break;
				
			case "C":
				a=sc.nextInt();
				C[a-1] = 1;
				break;
				
			case "D":
				a = sc.nextInt();
				D[a-1] = 1;
				break;
				
			case "H":
				a=sc.nextInt();
				H[a-1] = 1;
				break;
			}
		}
		
		for (int i = 0; i < H.length; i++) {
			if(S[i] == 0)
				System.out.println("S "+(i+1));
		}
		
		for (int i = 0; i < H.length; i++) {
			if(H[i] == 0)
				System.out.println("H "+(i+1));
		}
		
		for (int i = 0; i < H.length; i++) {
			if(C[i] == 0)
				System.out.println("C "+(i+1));
		}
		for (int i = 0; i < H.length; i++) {
			if(D[i] == 0)
				System.out.println("D "+(i+1));
		}
		
	}
}
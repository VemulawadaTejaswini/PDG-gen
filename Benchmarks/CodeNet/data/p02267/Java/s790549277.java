import java.util.Scanner;
class Main {
   public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] S = new int[n]; 
		
		for(int i = 0; i < n; i++){
			S[i] = scan.nextInt();
		}
		
		int q = scan.nextInt();
		int[] T = new int[q];
		
		for(int i = 0; i < q; i++){
			T[i] = scan.nextInt();
		}
		
		int result = 0;
		for(int i = 0; i < T.length; i++){
			result += linearSearch(S, T[i]);
		}
		
		System.out.println(result);
	}

	static int linearSearch(int data[], int serch){
		int found = 0;
		
		for(int i = 0; i < data.length; i++){
			if(data[i] == serch){
				found++;
			}
		}
		
		return found;
	}
}
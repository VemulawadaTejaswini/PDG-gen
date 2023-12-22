import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		int C = 0;
		Scanner in = new Scanner(System.in);
		//??°???S?????????
		int n = in.nextInt();
		int[] S = new int[n];
		for(int i = 0;i<n;i++) S[i] = in.nextInt();
		//??°???T?????????
		int q = in.nextInt();
		int[] T = new int[q];
		for(int i = 0;i<q;i++) T[i] = in.nextInt();
		
	
		for(int i = 0;i<q;i++){
			int searchkey = T[i];
			int lowerBound = 0;
			int upperBound = n-1;
			int curIn;
			while(true){
				curIn = (lowerBound+upperBound)/2;
				if(S[curIn] == searchkey) {
					C++;
					break;
				}else if(lowerBound>upperBound) break;
				else{
					if(S[curIn]<searchkey)
						lowerBound = curIn +1;
					else
						upperBound = curIn -1;
				}
				
			}
		}
		System.out.println(C);
	}
}
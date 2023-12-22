import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int chart[] = new int[n];
		for(int i=0; i<n; i++){
			chart[i] = in.nextInt();
		}
		for(int j=n; j>0; j--){
			System.out.print(chart[j-1]);
			if(j==1) break;
			System.out.print(" ");
		}
		System.out.println();

	}
}
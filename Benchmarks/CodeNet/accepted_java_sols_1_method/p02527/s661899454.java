import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		int n = Integer.parseInt(sc2.nextLine());
		String[] s = sc2.nextLine().split("[\\s]+");
		int[] x = new int[n];
		
		for(int i=0;i<n;i++){
			x[i]= Integer.parseInt(s[i]);
		}
		Arrays.sort(x);
		for(int i=0;i<n;i++){
			System.out.print(x[i]);
			if(i == n-1) {
				System.out.println();
				break;
			}
			else{System.out.print(" ");}
		}
	}
}
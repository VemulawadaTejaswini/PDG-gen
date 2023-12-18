import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String inputN = scanner.nextLine();
		
		String inputP = scanner.nextLine();
		String[] pStr = inputP.split(" ", 0);
		
		int n = Integer.parseInt(inputN);
		int pInt[] = new int[n];
		for(int i=0;i<n;i++){
			pInt[i] = Integer.parseInt(pStr[i]);
		}
		
		for(int i=1;i<n;i++){
			if(pInt[i] > pInt[i-1]){
				pInt[i]--;
			}
		}
		
		boolean isStair = true;
		
		for(int i=1;i<n;i++){
			if(pInt[i] < pInt[i-1]){
				isStair = false;
			}
		}
		
		String show = isStair ? "Yes" : "No";
		System.out.println(show);
	}
}
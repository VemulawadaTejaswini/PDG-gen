import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int sArray[] = new int[n];
		int c=0;


		for(int i=0; i<n; i++){
			sArray[i] = scn.nextInt();
		}

		int q = scn.nextInt();
		int tArray[] = new int[q];

		for(int i=0; i<q; i++){
			tArray[i] = scn.nextInt();
		}

		for(int j=0; j<q; j++){
			for(int i=0; i<n; i++){
				if(tArray[j] == sArray[i]){
					c++;
					break;
				}
			}
		}
		System.out.println(c);
	}
}
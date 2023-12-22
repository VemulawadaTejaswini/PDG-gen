
import java.util.Scanner;
 class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int result[] = new int[1000000],i = 0;
		while(true){
			result[i] = sc.nextInt();
			if(result[i] == 0) break;
			i++;
		}
		for(int j = 0; j < i; j++){
			System.out.println("Case "+(j+1)+": "+result[j]);
		}
	}
 }
 
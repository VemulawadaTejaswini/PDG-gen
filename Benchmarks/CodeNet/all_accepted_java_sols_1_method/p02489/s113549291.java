import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int c = 10000000;
		int x[] = new int[c];
		int i = 0;
		while(true){
			x[i] = sc.nextInt();
			if(x[i] == 0){
				break;
			} else {
				i++;
			}
		}
		for(int j = 1; j < i+1; j++){
			System.out.println("Case "+j+": "+ x[j-1]);
		}
	}
}
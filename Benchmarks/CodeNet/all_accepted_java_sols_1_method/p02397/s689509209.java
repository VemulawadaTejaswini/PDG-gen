
import java.util.Scanner;
 class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int x[] = new int[100000], y[] = new int[100000];
		int i = 0,a;
		while(true){
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			if(x[i] == 0 && y[i] == 0) break;
			if(x[i] > y[i]){
				a = x[i];
				x[i] = y[i];
				y[i] = a;
			}
			i++;
		}
		for(int j = 0; j < i; j++){
			System.out.println(x[j]+" "+y[j]);
		}
	}
 }
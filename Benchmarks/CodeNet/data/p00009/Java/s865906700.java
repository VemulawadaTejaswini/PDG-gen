import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int result[] = new int[30];
		int count = 0, a,x = 0;
		while(sc.hasNext()){
			a = sc.nextInt();
			for(int i = 2; i <= a; i++){
				for(int j = 2; j <= i; j++){
					if(i%j == 0 && i != j) break;
					if (i == j){
						count++;
					}
				}
			}
			result[x] = count;
			count = 0;
			x++;
		}
		for(int i = 0; i < x; i++){
			System.out.println(result[i]);
		}
	}
}
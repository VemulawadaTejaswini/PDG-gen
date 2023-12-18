import java.util.Scanner;
 class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n,x = 0;
		int result[] = new int[100];
		while(true){
			n = sc.nextInt()/4;
			if(n == 0) break;
			for(int i = 0; i < n; i++){
				result[x] += sc.nextInt();
			}
			x++;
		}
		for(int i = 0; i < x; i++){
			System.out.println(result[i]);
		}
	}
}
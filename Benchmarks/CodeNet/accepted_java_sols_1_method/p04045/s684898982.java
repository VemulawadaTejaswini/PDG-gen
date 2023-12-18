import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();

		String[] d = new String[k];
		for(int i = 0; i < k; i++){
			d[i] = scan.next();
		}

		for(int i = n; i < 10*n; i++){
			int count = 0;
			for(int j = 0; j < k; j++){
				if(!String.valueOf(i).contains(d[j])){
					count ++;
				}
			}
			if(count == k){
				System.out.println(i);
				return;
			}
		}
	}
}

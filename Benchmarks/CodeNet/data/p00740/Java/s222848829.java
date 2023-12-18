import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true){
			int n = stdIn.nextInt();
			int p = stdIn.nextInt();
			if(n==0&&p==0){
				return;
			}
			int[] te = new int[n];
			int table = p;
			for(int i=0;i<n;i++){
				te[i] = 0;
			}
			int i = 0;
			while(true){
				if(te[i]==p){
					break;
				}
				if(table!=0){
					table--;
					te[i]++;
				}
				else{
					table = te[i];
					te[i] = 0;
				}
				i++;
				if(i==n){
					i = 0;
				}
			}
			System.out.println(i);
		}
	}
}
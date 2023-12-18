import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int count = 0;
		while(true){
			int n = scan.nextInt();
			int x = scan.nextInt();

			if(n==0&&x==0){
				break;
			}

			for(int i = 1; i<=n; i++){
				for(int j = 1; j<=n; j++){
					for(int k = 0; k<=n; k++){
						if(i+j+k==x){
							if(i<j&&j<k){
								count++;
							}
						}
					}
				}
			}
			System.out.println(count);
			count = 0;
		}
	}
}
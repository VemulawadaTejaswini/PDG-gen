import java.util.Scanner;
	public class Main{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			while(sc.hasNext()){
				int n = sc.nextInt();
				if(n == 0){
					break;
				}
				int num[] = new int[n];
				int max = -1000000000;
				int sum = 0;
				for(int i = 0; i < n ; i++){
					num[i]=sc.nextInt();
					sum = Math.max((sum + num[i]),num[i]);
					max = Math.max(max,sum);
				}
				System.out.println(max);
			}
		}
	}
	
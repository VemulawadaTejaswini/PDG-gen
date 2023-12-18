import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int count=0;
			int n=scan.nextInt();
			int[] num = new int[51];
			for(int i=0;i<=9;i++){
				for(int j=0;j<=9;j++){
					for(int k=0;k<=9;k++){
						for(int l=0;l<=9;l++){
							num[i+j+k+l]++;
							//if((i+j+k+l)==n){
								//count++;
						}
					}
				}
			}
			System.out.println(num[n]);
		}
	}
}
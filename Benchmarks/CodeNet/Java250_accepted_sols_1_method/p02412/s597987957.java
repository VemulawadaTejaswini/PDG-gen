import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		while(sc.hasNextInt()){
			int n=sc.nextInt();
			int sum=sc.nextInt();
			if(n==0&&sum==0)break;
			int count=0;
			for(int i=1;i<=n;i++){
				for(int j=1;j<=n;j++){
					for(int k=1;k<=n;k++){
						if(i+j+k==sum&&i!=j&&j!=k&&i!=k){
							count++;
						}
					}
				}
			}
			System.out.println(count/6);
		}
	}
}
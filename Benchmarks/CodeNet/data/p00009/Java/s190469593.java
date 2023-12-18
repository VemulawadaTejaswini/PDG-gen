import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int count=1;
			int n=sc.nextInt();
			if(n<=1){
				count=0;
			}
			for(int i=3;i<=n;i+=2){
				if(i==3||i==5){
					count++;
				}
				for(int j=3;j<=i/2;j+=2){
					if(i%j==0){
						break;
					}else if(j==i/2){
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}
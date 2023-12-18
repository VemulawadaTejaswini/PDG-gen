import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
		
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count=0;
		
		if(a == 0&&b == 0){
			System.exit(0);
		}
		
		for(int i=1;i<=a;i++){
			for(int j=1;j<i;j++){
				for(int k=1;k<j;k++){
					if(i==j||j==k||i==k){
					}else if(i+j+k==b){
						count+=1;
					}
					}
				}
			}
		System.out.println(count);
		}
}
}
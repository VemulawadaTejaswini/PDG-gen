import java.util.Scanner;

public class Main {
	public static void main(String[] agrs){
		int count=0,i,j,k;
		Scanner sc = new Scanner(System.in);
		while(true){
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(x==0&&y==0){
			break;
		}
		for(i=1;i<=x-2;i++){
			for(j=i+1;j<=x-1;j++){
				for(k=j+1;k<=x;k++){
					if(i+j+k==y){
						count++;
					}
				}
			}
		}
		System.out.printf("%d\n",count);
	}
}
}
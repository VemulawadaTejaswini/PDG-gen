import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,count,n;
		while(true){
			count=0;
			n=sc.nextInt();
			if(n==0) break;
			for(i=0;i<n/4;i++){
				count+=sc.nextInt();
			}
			System.out.println(count);
		}
	}

}
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n;
			n = sc.nextInt();
			if(n==0)break;
			int sum=0;
			for(int i=0;i<n/4;i++){
				sum += sc.nextInt();
			}
			System.out.println(sum);
		}
	}

}
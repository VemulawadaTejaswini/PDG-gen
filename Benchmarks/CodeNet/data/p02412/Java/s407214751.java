import java.util.Scanner;



public class Main{


	public static void main(String[] args){

		Scanner scan=new Scanner(System.in);

		while(true){
		int n=scan.nextInt();
		int x=scan.nextInt();

		if(n==0&&x==0)break;

		System.out.println(return_num(n,x));

		}

		scan.close();
	}

	public static int return_num(int n, int x){
		int num=0;

		for(int i=1;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				for(int k=j+1;k<n+1;k++){
					if(i+j+k==x)num++;
				}
			}
		}


	return num;
			}


}
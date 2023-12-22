import java.util.Scanner;

public class Main{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		int k=sc.nextInt();
		int gn=0;
		int kn=0;

		for(int i=1;i<=k;i++){
			if(i%2==0){
				gn++;
			}else{
				kn++;
			}
		}
		System.out.println(gn*kn);

	}



}

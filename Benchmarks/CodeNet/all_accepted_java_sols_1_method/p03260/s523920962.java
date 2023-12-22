import java.util.Scanner;

public class Main{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		int a=sc.nextInt();
		int b=sc.nextInt();
		int c;
		boolean ans=false;

		for(int i=1;i<=3;i++){
			c=a*b*i;
			if(c%2==1){
				ans=true;
				break;
			}else{
				ans=false;
			}
		}

		if(ans==true){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}

}

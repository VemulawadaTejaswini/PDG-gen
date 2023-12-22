import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int n,i,t,x;
		n=stdIn.nextInt();
		for(i=1;i<=n;i++){
			t=0;
			x=i;
			while(x!=0){
				if(x%10==3){
					t++;
					break;
				}
				x/=10;
			}
			if(i%3==0||t!=0)System.out.print(" "+i);
		}
		System.out.println();
	}
}

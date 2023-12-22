import java.util.Scanner;
public class Main {

	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int s=stdIn.nextInt();
		int S[]=new int[1000000];
		int z=0,y=0,x=0;
		while(true){
			if(z==0){
				S[z]=s;
			}
			else{
				if(S[z-1]%2==0)
					S[z]=S[z-1]/2;
				else
					S[z]=(3*S[z-1])+1;
				while(y<z){
					if(S[z]==S[y])
						x=1;
					y++;
				}y=0;
			}
			if(x==1)
				break;
			z++;
		}
		System.out.println(z+1);
	}
}

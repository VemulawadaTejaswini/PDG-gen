import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int Y=stdIn.nextInt();
		int z=0,y=0,fin=0;
		while(z<N+1){
			while(y<N+1){
				if(z+y>N)
					break;
				if(z*10000+y*5000+(N-y-z)*1000==Y){
					fin=1;
					break;
				}
				y++;
			}
			if(fin==1)
				break;
			z++;y=0;
		}
		if(fin==1)
			System.out.println(z+" "+y+" "+(N-y-z));
		else
			System.out.println("-1 -1 -1");
	}

}
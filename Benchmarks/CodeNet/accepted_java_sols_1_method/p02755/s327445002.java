import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		for(int i=1;i<=10000;i++){
			if(((int)(i*0.08)==A)&&((int)(i*0.1)==B)){
				System.out.println(i);
				System.exit(0);
			}
		}
		System.out.println(-1);
	}
}

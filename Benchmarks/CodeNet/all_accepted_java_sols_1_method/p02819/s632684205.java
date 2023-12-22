import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		long X=stdIn.nextLong();
		long a=2;
		boolean key=false;
		while(true){
			for(;a<=Math.sqrt(X);a+=2){
				if(X%a==0){
					key=true;
					break;
				}
				if(a==2)
					a--;
			}
			if(key==false){
				System.out.println(X);
				System.exit(0);
			}
			key=false;X++;a=2;
		}
	}
}

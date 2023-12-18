import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		long N=stdIn.nextLong();
		long max=0;
		for(int i=1;i<Math.sqrt(N)+1;i++){
			if(N%i==0&&max<i)
				max=i;
		}
		System.out.println(max+N/max-2);
	}
}
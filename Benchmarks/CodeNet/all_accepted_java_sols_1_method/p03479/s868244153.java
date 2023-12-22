import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc=new Scanner(System.in)){
			long X=sc.nextLong();
			long Y=sc.nextLong();
			long count=0;
			for(long i=X; i<=Y; i=i*2) {
				count++;
			}
			System.out.println(count);
		}
	}	
}
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a,b;
		for(;scanner.hasNextInt();){
			a=scanner.nextInt();b=scanner.nextInt();
			System.out.println((int)Math.floor(Math.log10(a+b)+1));
		}
	}

}
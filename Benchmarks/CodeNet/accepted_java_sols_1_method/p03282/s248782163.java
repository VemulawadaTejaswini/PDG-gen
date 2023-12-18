import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner stdIn=new Scanner(System.in);
		String s=stdIn.next();
		long k=stdIn.nextLong();
		int S=0;
		int z=0;
		while(z<s.length()){
			S=Integer.valueOf(s.substring(z,z+1));
			if(S!=1)
				break;
			else
				if(z+1==k)
					break;
			z++;
		}
		System.out.println(S);
	}
}
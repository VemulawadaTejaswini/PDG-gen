import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		String s=stdIn.next();
		int z=0;
		int zero=0,one=0;
		while(z<s.length()){
			if(s.substring(z, z+1).equals("1"))
				one++;
			else
				zero++;
			z++;
		}
		if(one>=zero)
			System.out.println(zero*2);
		else
			System.out.println(one*2);
	}

}
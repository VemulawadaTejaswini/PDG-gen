import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		String S=stdIn.next();
		if(Integer.valueOf(S.substring(0,4))<2019)
			System.out.println("Heisei");
		else
			if(Integer.valueOf(S.substring(0,4))>2019)
				System.out.println("TBD");
			else
				if(Integer.valueOf(S.substring(5,7))<4)
					System.out.println("Heisei");
				else
					if(Integer.valueOf(S.substring(5,7))>4)
						System.out.println("TBD");
					else
						if(Integer.valueOf(S.substring(8,10))<=30)
							System.out.println("Heisei");
						else
							System.out.println("TBD");
	}

}
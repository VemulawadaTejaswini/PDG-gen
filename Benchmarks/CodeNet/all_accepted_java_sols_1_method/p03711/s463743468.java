import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();

		String[] ana = new String[3];
		ana = line.split(" ");
		int jal[] = new int[3];
		int t = 0;
		for (int i = 0; i < ana.length; i++)
			jal[i] = Integer.parseInt(ana[i]);
		if((jal[0]==2) || (jal[1]==1))
			System.out.println("No");
		else if((jal[0]==1) || (jal[0]==3) || (jal[0]==5) || (jal[0]==7) || (jal[0]==8) || (jal[0]==10) || (jal[0]==12))
			if((jal[1]==1) || (jal[1]==3) || (jal[1]==5) || (jal[1]==7) || (jal[1]==8) || (jal[1]==10) || (jal[1]==12))
				System.out.println("Yes");
			else System.out.println("No");
		else if((jal[0]==1) || (jal[0]==6) || (jal[0]==9) || (jal[0]==11))
			if((jal[1]==6) || (jal[1]==9) || (jal[1]==11))
				{System.out.println("Yes");}
			else
				System.out.println("No");
	}
}

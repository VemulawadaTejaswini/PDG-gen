
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] jal = new String[3];
		jal = line.split(" ");
		if((jal[0].substring(jal[0].length()-1)).equals(jal[1].substring(0, 1)))
			if((jal[1].substring(jal[1].length()-1)).equals(jal[2].substring(0, 1)))
				{System.out.println("YES");}
			else
			{System.out.println("NO");}
		else
		{System.out.println("NO");}

	}
}

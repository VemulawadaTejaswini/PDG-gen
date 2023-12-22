import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str;
            while ((str = br.readLine()) != null) {
            	int N = Integer.parseInt(str);
            	str = br.readLine();
            	String[] Field = str.split(" ");
            	int MaxDice = 1;
            	int tmp = 1;
            	for (int i = 0; i < N; i++) {
            		if (Field[i].equals("1")) {
            			tmp++;
            		} else {
            			MaxDice = Math.max(MaxDice, tmp);
            			tmp = 1;
            		}
            	}
            	MaxDice = Math.max(MaxDice, tmp);
            	System.out.println(MaxDice);
            }
            } catch (Exception e) {
                System.out.println(e);
            }
	}

}


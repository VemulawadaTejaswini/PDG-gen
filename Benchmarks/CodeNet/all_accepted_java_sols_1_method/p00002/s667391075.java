import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = new String();
        try {
			while ((line = br.readLine()) != null) {
			    String[]	as  = line.split(" ");
			    int			n1 = Integer.parseInt(as[0]);
			    int			n2 = Integer.parseInt(as[1]);
			    String		s1 = String.valueOf(n1 + n2);
			    System.out.println(s1.length());
			}
		}
        catch (Exception e) {}
	}
}
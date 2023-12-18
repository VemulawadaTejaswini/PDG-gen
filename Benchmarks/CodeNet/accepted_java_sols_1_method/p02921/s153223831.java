import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
		try {
      		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int count = 0;
      		String s = br.readLine();
      		String t = br.readLine();
      		for(int i=0; i<3; i++) {
          		if(s.charAt(i) == t.charAt(i)) {
              		count++;
				}
			}
			System.out.println(count);
        } catch(Exception e) {
          System.out.println(e);
        }
	}
}
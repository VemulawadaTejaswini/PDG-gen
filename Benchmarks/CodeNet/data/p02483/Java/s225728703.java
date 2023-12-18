import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		String s;
		int[] a=new int[3];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			s=br.readLine();
			a[0]=Integer.parseInt(s.substring(0,s.indexOf(" ")));
			a[1]=Integer.parseInt(s.substring(s.indexOf(" ")+1,s.lastIndexOf(" ")));
			a[2]=Integer.parseInt(s.substring(s.lastIndexOf(" ")+1,s.length()));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Arrays.sort(a);
		System.out.println(a[0]+" "+a[1]+" "+a[2]);
	}

}
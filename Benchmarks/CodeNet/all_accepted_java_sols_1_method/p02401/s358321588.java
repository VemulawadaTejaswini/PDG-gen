import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main (String[] args) throws java.lang.Exception
	{
		ArrayList<String> array = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a,  b;
		while(true) {
			array.add(br.readLine());
			String s = array.get(array.size() - 1);
			String[] ary = s.split(" ");
		    if(ary[1].equals("?")) {
		    	break;
		    }
		}
		
		for(int i = 0; i < array.size() - 1; i++) {
			String s = array.get(i);
			String[] ary = s.split(" ");
			a = Integer.parseInt(ary[0]);
			b = Integer.parseInt(ary[2]);
			if(ary[1].equals("+")) {
				System.out.println(a + b);
			}
			if(ary[1].equals("-")) {
				System.out.println(a - b);
			}
			if(ary[1].equals("*")) {
				System.out.println(a * b);
			}
			if(ary[1].equals("/")) {
				System.out.println(a / b);
			}
		}

	}
}
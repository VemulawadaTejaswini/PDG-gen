import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main (String[] args) throws java.lang.Exception
	{
		ArrayList<String> x = new ArrayList<String>();
		ArrayList<Integer> intAry = new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int i = 0;
		while(true) {
			x.add(br.readLine());
			String s = x.get(i);
			if(s.equals("0 0")) {
				break;
			}else {
				i++;
			}
		}

		
		for(int j = 0; j < x.size() - 1; j++) {
			String s = x.get(j);
			String[] strAry = s.split(" ");
			int a = Integer.parseInt(strAry[0]);
			int b = Integer.parseInt(strAry[1]);
			if(a > b) {
				int r = a;
				a = b;
				b = r;
			}
			intAry.add(a);
			intAry.add(b);
		}
		
		for(int j = 0; j < intAry.size(); j++) {
			if(j % 2 == 1) {
				System.out.println(intAry.get(j));
			}else {
				System.out.print(intAry.get(j) + " ");
			}
			
		}


	}
}
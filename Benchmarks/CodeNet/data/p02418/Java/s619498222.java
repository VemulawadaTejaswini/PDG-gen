import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=null;
		String p=null;
		int flag=0;
		try {
			s=br.readLine().toLowerCase();
			p=br.readLine().toLowerCase();
		} catch (Exception e) {
			System.err.println("Error");
			// TODO: handle exception
		}
		s=s+s;
		for(int i=0;i<s.length()/2;i++){
			String str=s.substring(i, i+p.length());
			if(str.equals(p)) {
				flag=1;
			}
		}
		
		if(flag==1) System.out.println("Yes");
		else System.out.println("No");
	}
}
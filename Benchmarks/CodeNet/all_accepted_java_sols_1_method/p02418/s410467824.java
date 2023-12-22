import java.io.*;

public class Main {
	public static void main(String[] age)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String p = br.readLine();
		StringBuffer sb = new StringBuffer();
		int i = 0;
		int j = 0;
		int x = 0;

		for( i=0 ; i<s.length() ; i++ ){
			if ( (i+p.length())>s.length() ){
				x = (i+p.length())-s.length();
				sb.append(s.substring(i, s.length())).append(s.substring(0, x));
			}else{
				sb.append(s.substring(i, i+p.length()));
			}
			if( sb.toString().equals(p) ){
				j++;
				break;
			}
			sb.setLength(0);
		}

		if( j==0){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
	}
}
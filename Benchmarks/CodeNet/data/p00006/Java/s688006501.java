import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main{
    public static void main(String[] a) throws IOException{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuffer str1 = new StringBuffer("");
		if(str != null && !str.isEmpty()) {
			int l =str.length();
			for(int i=l-1;i>=0;i--) {
				System.out.print(str.charAt(i));
			}
			
		}
    }
}
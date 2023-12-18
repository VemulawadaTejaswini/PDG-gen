import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s = reader.readLine();
		int a = 0;
		while(true){
			if(s.charAt(0) == '0'){
				break;
			}
			
			for(int i=0;i < s.length();i++){
				a += Character.getNumericValue(s.charAt(i));
			}
			System.out.printf("%d\n",a);
		}
	}
}
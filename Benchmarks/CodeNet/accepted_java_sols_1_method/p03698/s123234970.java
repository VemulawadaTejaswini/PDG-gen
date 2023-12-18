import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		str=bfr.readLine();
		boolean doublei=false;
		char[] moji=new char[str.length()];
		for(int i=0; i<str.length(); i++) {
			moji[i]=str.charAt(i);
		}

		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<str.length(); j++) {
				if(moji[i]==moji[j]) {
					System.out.println("no");
					doublei=true;
					System.exit(0);
				}
			}
		}

		if(doublei==false) {
			System.out.println("yes");
		}
		else {}
	}
}
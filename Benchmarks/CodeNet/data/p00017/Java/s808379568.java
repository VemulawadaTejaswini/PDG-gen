import java.io.*;
import java.util.StringTokenizer;

class CaesarCipher {
	String s;
	String alph = "abcdefghijklmnopqrstuvwxyz";

	CaesarCipher(String s) {
		this.s = s;
	}

	boolean NotFound() {
		if (this.s.indexOf("the")==-1&&
			this.s.indexOf("that")==-1&&
				this.s.indexOf("this")==-1) return true;
		else return false;
	}

	String FindWord() {
		while (NotFound()) {
			String t = "";
			for (int i=0;i<this.s.length();i++) { 
				if (alph.indexOf(this.s.charAt(i))!=-1)
					t = t+alph.charAt((alph.indexOf(this.s.charAt(i))+1)%26);
				else t = t+this.s.charAt(i);
			}
			this.s = t.toString();
		}
		return this.s;
	}
}

class Main {
    public static void main(String args[]) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String buf;

	try {
		while ((buf = br.readLine())!=null) {
			CaesarCipher cc = new CaesarCipher(buf);
			System.out.println(cc.FindWord());
		}
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
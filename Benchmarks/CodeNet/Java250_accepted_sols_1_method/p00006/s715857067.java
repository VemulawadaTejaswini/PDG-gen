import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s=r.readLine();
		try {
			for(int i=s.length()-1;i>=0;i--){
				System.out.print(s.charAt(i));
			}
			System.out.println("");
		} catch (Exception err) {
			System.exit(0);
		}
	}
}
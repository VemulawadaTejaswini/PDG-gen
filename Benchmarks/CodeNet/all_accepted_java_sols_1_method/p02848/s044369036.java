import java.io.*;

class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			String line = reader.readLine();
			int n = Integer.parseInt(line);
			String s = reader.readLine();
			char[] c = s.toCharArray();
			char x = 'Z';

			for(int i = 0; i < c.length; i++){
				if(((c[i] + n) - x) > 0){
					c[i] = ((char)(c[i] + n - 26));
				}else{
					c[i] = ((char)(c[i] + n));
				}
				System.out.print(c[i]);
			}
			System.out.println("");
		} catch(IOException e) {
			System.out.println(e);
		} catch(NumberFormatException e){
			System.out.println(e);
		}
	}
}
import java.io.*;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String str = buf.readLine();
		char[] a = str.toCharArray();

		for(int i=0; i<a.length; i++){
			if(Character.isLowerCase(a[i]))
				System.out.print(Character.toUpperCase(a[i]));
			else if(Character.isUpperCase(a[i]))
				System.out.print(Character.toLowerCase(a[i]));
			else 
				System.out.print(a[i]);
			if(i==a.length-1)
				System.out.println();

		}
	}
}
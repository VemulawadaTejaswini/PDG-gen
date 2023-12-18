import java.io.*;

class Main {
	public static void main (String[] args) throws IOException{
		BufferedReader input =
        new BufferedReader (new InputStreamReader (System.in));
        String str = input.readLine( );
        
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                System.out.print(Character.toLowerCase(c));
            } else {
                System.out.print(Character.toUpperCase(c));
            }
        }
        System.out.println("");
	}
}
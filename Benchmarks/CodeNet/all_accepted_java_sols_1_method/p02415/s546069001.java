import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		String s;
		BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));
			s = kbd.readLine();
			for(int i = 0; i < s.length(); i++){
				if(Character.isUpperCase(s.charAt(i)))
					System.out.print(Character.toLowerCase(s.charAt(i)));
				else if(Character.isLowerCase(s.charAt(i)))
					System.out.print(Character.toUpperCase(s.charAt(i)));
				else
					System.out.print(s.charAt(i));
			}
				System.out.println("");
	}

}
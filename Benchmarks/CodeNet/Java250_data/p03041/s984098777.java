import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader r = new BufferedReader (new InputStreamReader (System.in));
		String s1 = r.readLine();
		int index = Integer.valueOf(s1.split(" ")[1]) - 1;
		char[] s2 = r.readLine().toCharArray();
		char c = s2[index];
		s2[index] = Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
		System.out.println(new String(s2));
	}
}
import java.io.*;
public class Main {
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
String line = reader.readLine();
int a = Integer.parseInt(line);
a=a*a*a;
System.out.println(a);
    }
}
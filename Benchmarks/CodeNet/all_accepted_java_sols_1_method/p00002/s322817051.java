import java.io.*;
public class Main {
public static void main(String args[]) throws IOException {
BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
while(true){
String s = r.readLine();
if(s == null) break;
int i = s.indexOf(" ");
int sum = Integer.valueOf(s.substring(0, i)) +  Integer.valueOf(s.substring(i+1));
System.out.println(Integer.toString(sum).length());
}
}
}
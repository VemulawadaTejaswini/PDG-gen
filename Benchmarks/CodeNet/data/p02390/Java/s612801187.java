import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

public static void main(String[] args) {
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
String str = reader.readLine();

int a = Integer.parseInt(str);
int h = a/3600;
a%=3600;
int m = a/60;
a%=60;
a=s;

System.out.println(h+":"+m+":"+s);
}
}
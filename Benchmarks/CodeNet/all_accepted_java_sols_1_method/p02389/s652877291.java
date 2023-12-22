import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

public static void main(String[] args) {
try {
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
String str = reader.readLine();
String[] array = str.split(" ");
int a = Integer.parseInt(array[0]);
int b = Integer.parseInt(array[1]);
System.out.println(a * b + " " + (a + b) * 2);
} catch (IOException e) {
e.printStackTrace();
}
}

}
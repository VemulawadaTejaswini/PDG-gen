import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
String line = in.readLine();
String[] params = line.split(" ");
int a1 = Integer.parseInt(params[0]);
int a2 = Integer.parseInt(params[1]);
int a3 = Integer.parseInt(params[2]);

int sum = a1 + a2 + a3;
if (sum >= 22) {
	System.out.println("bust");
} else {
	System.out.println("win");
}
}
	}
}

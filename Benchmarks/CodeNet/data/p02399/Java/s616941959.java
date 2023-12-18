import java.util.scanner;

public class Main() {

public static void main(String[] args) {
Scanner scan = new Scanner();
int p = scan.nextInt();
int q = scan.nextInt();
int w = p / q;
int c = p % q;
float r = p / q;

System.out.println(w + " " + c + " " + r);
}
}


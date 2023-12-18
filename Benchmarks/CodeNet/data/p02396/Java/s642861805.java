import java.util.Scanner;

public class Main{

public static void main(String[] args) {
int p = 9;
int counter = 1;
while (p != 0) {
Scanner scan = new Scanner(System.in);
p = scan.nextInt();
System.out.println("Case " + counter +": " + p);
counter++;
} 

}
}


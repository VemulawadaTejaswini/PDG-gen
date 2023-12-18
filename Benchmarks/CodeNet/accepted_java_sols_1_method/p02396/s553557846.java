import java.util.Scanner;

public class Main{

public static void main(String[] args) {
int p = 9;
int counter = 1;
Scanner scan = new Scanner(System.in);
while (p != 0) {
p = scan.nextInt();
if (p != 0) {
System.out.println("Case " + counter +": " + p);
}
counter++;
} 

}
}


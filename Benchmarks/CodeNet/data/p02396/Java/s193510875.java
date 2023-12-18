import java.util.Scanner;

public class Main{

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int p = 9;
int counter = 1;
while (p != 0) {
p = (Integer) scan.nextLine();
System.out.println("Case " + counter +": " + p);
counter++;
} 

}
}


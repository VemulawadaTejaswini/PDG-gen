import java.util.Scanner;

public class Main{

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int p = 9;
int q = 0;
int counter = 1;
while (p != 0 || q != 0) {
p = scan.nextInt();
q = scan.nextInt();
if (p > q) {
System.out.println(p + " " + q);
} else {
System.out.println(q + " " + p);
}
counter++;
} 

}
}


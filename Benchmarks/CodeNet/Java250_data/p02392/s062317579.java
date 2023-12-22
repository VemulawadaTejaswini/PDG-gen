import java.util.Scanner;

class Main{

public static void larger(int a, int b, int c){
if ((a < b) && (b < c)){
System.out.println("Yes");
}else {
System.out.println("No");
}
}
	
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int p = scanner.nextInt();
int q = scanner.nextInt();
int w = scanner.nextInt();
larger(p, q, w);

}
}


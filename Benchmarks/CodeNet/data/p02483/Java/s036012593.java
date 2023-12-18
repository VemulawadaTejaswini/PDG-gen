import java.util.Scanner;
public class Main{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
if (a < b) {
if (b < c) {
System.out.printf("%d %d %d?\n", a, b, c);
} else{
	if(a < c) {
	System.out.printf("%d %d %dln", a, c, b);
} else {
	System.out.printf("%d %d %dln", c, a, b);
}
 }
}
else { 
	if (a < c) {
		System.out.printf("%d %d %dln", b, a, c);
	}else{
 if (c < b) {
		System.out.printf("%d %d %dln", c, b, a);
	}else {
		System.out.printf("%d %d %dln", b, c, a);
		
		
	}	
	}
} 
}
}
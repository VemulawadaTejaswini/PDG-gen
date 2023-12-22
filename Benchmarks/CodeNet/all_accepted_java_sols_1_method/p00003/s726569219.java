import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
int[] x = new int[3];
for (int i = 0; i < n; i++) {
x[0] = scn.nextInt();
x[1] = scn.nextInt();
x[2] = scn.nextInt();
Arrays.sort(x);
if (x[0] * x[0] + x[1] * x[1] == x[2] * x[2]) {
System.out.println("YES");
} else {
System.out.println("NO");
}
}
}
}
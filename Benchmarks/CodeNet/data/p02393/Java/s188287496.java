import java.util.Scanner;

public class Main{

public static void sort(int a, int b, int c) {
int lowest;
int mid;
int highest;
if (a < b && a < c) {
lowest = a;
} else if (b < a && b < c) {
lowest = b;
} else {
lowest = c;
}if (a > b && a > c) {
highest = a;
} else if (b > a && b > c) {
highest = b;
} else {
highest = c;
}if ((a > b && a < c) || (a <b && a > c)) {
mid = a;
} else if ((b > a && b < c) || (b < a && b > c)) {
mid = b;
} else {
mid = c;
}
System.out.println(lowest + " " + mid + " " + highest);
} else if (
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
int b = scan.nextInt();
int c = scan.nextInt();
sort(a, b, c);
}
}

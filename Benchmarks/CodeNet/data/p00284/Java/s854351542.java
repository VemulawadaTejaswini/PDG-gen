import java.util.*;
public class Main {
public static void main(String...args) {
final Scanner sc = new Scanner(System.in);
System.out.println(Integer.bitCount(sc.nextInt() ^ sc.nextInt()));
}
}
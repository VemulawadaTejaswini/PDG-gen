import java.util.*;
public class Main {
 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int i=0;
int s=sc.nextInt();
for(int j=0;j<9;j++) i+=sc.nextInt();
System.out.println(s-i);
 }
}
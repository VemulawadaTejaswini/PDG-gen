import java.util.Scanner;
 
class Main {
public static void main(String[] args) {
  final Scanner sc = new Scanner(System.in);
  final Integer distance = sc.nextInt();
  final Integer time = sc.nextInt();
  final Integer velocity = sc.nextInt();  
  
  if(time >= (float)distance / (float)velocity) {
    System.out.println("Yes");
  } else {
    System.out.println("No");
  }
}
}
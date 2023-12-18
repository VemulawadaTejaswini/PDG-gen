import java.util.Scanner;
 
public class Main{

public static void main(String[] args) {
 
int count = 0;
int H;
int A;
 
Scanner scanner = new Scanner(System.in);
H = scanner.nextInt();
A = scanner.nextInt();
 
while (H>0){
  H = H-A;
  count = count + 1;
}
  
System.out.println(count);
  
}
  
}
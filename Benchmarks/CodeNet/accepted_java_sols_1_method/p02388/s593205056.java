import java.util.Scanner;
public class Main{
public static void main(String[] args) {
  int num = 1;
   Scanner sc= new Scanner(System.in);
   int s = sc.nextInt();
  for (int i= 0; i < 3; i++){
      num *= s;
  }
        
System.out.println(num);
    }
    
    
}

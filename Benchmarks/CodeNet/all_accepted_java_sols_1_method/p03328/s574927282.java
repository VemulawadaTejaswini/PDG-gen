import java.util.Scanner;

class Main{
  public static void main(String args[]){
    int a;
    int b;
    Scanner sc = new Scanner(System.in);
    
       
   	 a = sc.nextInt();
   	 b = sc.nextInt();
     System.out.println((b-a) * (b - a + 1) / 2 - b);
  }
}

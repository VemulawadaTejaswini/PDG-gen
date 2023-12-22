import java.util.Scanner;

class Main {
  public static int calcGCD(int a, int b) {
    if(b > 0) {
      return calcGCD(b, a % b);  
    }   
    else {
      return a;
    }
  }
 
  public static int calcLCM(int a, int b) {
    return ((a / calcGCD(a, b)) * b);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) { 
      int a = sc.nextInt();
      int b = sc.nextInt();
      int gcd = calcGCD(a, b);      
      int lcm = calcLCM(a, b);
      System.out.println(gcd + " " + lcm);
    }    
  }
}
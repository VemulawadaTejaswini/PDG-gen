import java.util.*;
class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int rem = n%1000;
      if(rem==0)
        System.out.println(rem);
      else
        System.out.println(1000-rem);
    
    }
}
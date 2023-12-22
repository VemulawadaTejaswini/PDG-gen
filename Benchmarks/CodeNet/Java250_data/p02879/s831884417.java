import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
      	int ans;
    
     if (a > 9) {
       ans = -1;
     } else if (b > 9) {
       ans = -1;
     } else {
       ans = a * b;
     }
     
      System.out.println(ans);
    }
}
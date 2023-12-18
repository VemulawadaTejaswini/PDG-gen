import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = a%500;
       
      if(b>=x){
      System.out.print("Yes");
      }else{
      System.out.print("No");
      }
      
    }
}
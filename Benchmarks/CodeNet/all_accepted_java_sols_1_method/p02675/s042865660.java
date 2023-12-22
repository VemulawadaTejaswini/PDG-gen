import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int x = n%10;
      if(x==2 || x==4 || x==5 || x==7 || x==9){
      	System.out.println("hon");
      }else if(x==3){
        System.out.println("bon");
      }else{
        System.out.println("pon");
      }
    }
}

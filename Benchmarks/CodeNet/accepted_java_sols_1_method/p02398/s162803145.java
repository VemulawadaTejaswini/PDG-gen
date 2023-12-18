import java.util.*;

public class Main{
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   
   int a = sc.nextInt();
   int b = sc.nextInt();
   int c = sc.nextInt();
   
   int n = 0;
   
   for(int i=0; i<=b-a; i++){
      if(c%(a+i) == 0){
          n++;
      }
    }
    System.out.println(n);
 }
}
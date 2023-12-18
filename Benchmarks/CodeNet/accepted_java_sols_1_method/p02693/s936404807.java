import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int  k = sc.nextInt();
     int  a = sc.nextInt();
     int  b = sc.nextInt();
     int flag=0;
    for( int i=a;i<=b;i++){
      if(i%k==0){
        flag++;
      }
    }
    if(flag>0){
      System.out.println("OK");
    }else{
      System.out.println("NG");
    }
   }
}
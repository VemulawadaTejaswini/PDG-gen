import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(), b= sc.nextInt(), c=sc.nextInt();
   double sum = a;
    int i=1;
    int result=0;
    while(i<100){
     if(sum%b==c){
       result=1;
       break;
     }else{
       i++;
       sum +=a;
     }
   }
    if(result==1){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}


import java.util.Scanner;
 
public class Main{
  public static void main(String[] args){
 
    Scanner sc = new Scanner(System.in);
 
    int N = sc.nextInt();
    int count = 0;
 
    for(int i = 0; i < N; i++){
      int a = sc.nextInt();
      while(true){
      if(a % 2 == 0){
        a = a / 2;
        count = count + 1;
      }else{
        break;
      }
    }
  }
 
   System.out.println(count);
  }
}
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for(int i=3; i<=num; i++){
      int check = i;
      if(check%3==0){
          System.out.printf(" %d", check);
      }else{
          while(true){
               if ( check % 10 == 3 ){
                 System.out.printf(" %d", check);
                 break;
               }else{
                 check /= 10;
                 if(check==0)
                    break;
               }
          }
      }
    }
    System.out.printf("\n");
  }
}


import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    int targetNumber = Integer.parseInt(str);
    int count = 0;
    for(int i=1;i<=targetNumber;i++){
      if(targetNumber > 1){
        for(int j=1;j<=targetNumber;j++){
          for(int k=1;k<=targetNumber;k++){
            count++;      
          }
        }
      }else{
        count++;
      }
    }
    System.out.print(""+count+" ");
  }
}
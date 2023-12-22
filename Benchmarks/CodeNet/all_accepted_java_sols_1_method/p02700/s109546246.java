import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    int tHp = scan.nextInt();
    int tAt = scan.nextInt();
    int aHp = scan.nextInt();
    int aAt = scan.nextInt();
    
    for(int i = 0; i <200; i++){
      if(i%2 == 0)
        aHp = aHp - tAt;
      else
        tHp = tHp - aAt;
      
      if(aHp <=0 ){
        System.out.println("Yes");
        break;
      }
      else if(tHp <= 0){
        System.out.println("No");
        break;
      }
    }
  }
}
      

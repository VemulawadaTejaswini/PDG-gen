import java.util.Scanner;

class Main {
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();

    if(n < 4){
      System.out.println("No");
      return;
    }
      
    
    for(int i = 0; i < 26; i++){
      for(int j = 0; j < 15; j++){
        if(4 * i + 7 * j == n){
          System.out.println("Yes");
          return;
        }
        if(4 * i + 7 * j > 100)
          break;
      }
    }
      System.out.println("No"); 
  }
  
}
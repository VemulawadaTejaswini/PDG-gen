import java.util.Scanner;
public class Main{ 
  public static void main(String[] args) {                       
    Scanner sc = new Scanner(System.in); 
    int H = sc.nextInt();
    int i=1;
    while(i<=H){
      while(true){
        int x = i;
        if(x%3==0){
          System.out.print(" "+i);
          i++;
          break;
        }
        while (true) { 
          if (x % 10 == 3) { 
            System.out.print(" "+ i);
            i++; 
            break; 
          } 
          x /= 10; 
          if (x != 0){
            continue; 
          }
          else{
            i++;
            break;
          } 
        }
        break;
      }
    }
    System.out.println("");
  }
}
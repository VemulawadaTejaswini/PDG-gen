import java.util.Scanner; 
public class Main {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int x = 1;
      for(int a=1;;a++){
          x = sc.nextInt();
          if(x==0){
              break;
          }
          System.out.println("Case "+a+": "+x);
      }
  }
}

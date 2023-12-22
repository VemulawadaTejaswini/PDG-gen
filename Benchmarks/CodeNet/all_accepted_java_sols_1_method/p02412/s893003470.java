import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    while(true){
      int n = sc.nextInt();
      int x = sc.nextInt();
      int kumiawase = 0;
      if(n == 0 && x == 0){
        break;
      }

      for(int p = 1; p <= n; p++){
        for(int q = p+1; q <= n; q++){
          for(int r = q+1; r <= n; r++){
            if(p+q+r == x){
              kumiawase = kumiawase + 1;
            }
          }
        }
      }
      System.out.println(kumiawase);
    }
  }
}

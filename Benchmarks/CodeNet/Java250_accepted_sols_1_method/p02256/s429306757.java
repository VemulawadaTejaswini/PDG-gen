import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int y = sc.nextInt();
    int ans = 0;

    while(true){
      if(x<y){
        int change = x;
        x = y;
        y = change;
      }

      if(x%y > 0){
        int change = x%y;
        x = y;
        y = change;
      }
      else{
        ans = y;
        System.out.println(ans);
        break;
      }

    }
  }
}


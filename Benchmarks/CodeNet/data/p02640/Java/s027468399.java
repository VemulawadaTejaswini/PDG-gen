import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        boolean judge = false;
        for(int i = 0; i <= X; i++){
          if(2*i+4*(X-i) == Y){
            judge = true;
            break;
          }
        }
        if(judge == false)
          System.out.println("No");
        else
          System.out.println("Yes");
    }
}

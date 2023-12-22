import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int i = x, count = 1;
    for(;; i += x){
      count++;
      if(i%360 == 0)
        break;
    }
    
    System.out.println(i/x);
  }
}

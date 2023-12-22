import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int n = sc.nextInt();
    int[] p = new int[n];
    for(int i = 0;i<n;i++){
      p[i] = sc.nextInt();
    }

    int a = 0;
    while(true){
      int check = x - a;
      boolean ju = true;
      for(int i = 0;i<n;i++){
        if(check == p[i]){
          ju = false;
          break;
        }
      }
      if(ju == true){
        System.out.println(check);
        return;
      }
      check = x + a;
      for(int i = 0;i<n;i++){
        if(check == p[i]){
          ju = true;
          break;
        }
      }
      if(ju == false){
        System.out.println(check);
        return;
      }

      a++;
    }
  }
}

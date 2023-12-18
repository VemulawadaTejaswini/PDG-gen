import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int d = 0;
    int l = 0;
    int count = 1;

    for(int i=0; i<n; i++){
      l = sc.nextInt();
      d = d + l;
      if(d<=x){
        count += 1;
      }else{
        break;
      }
    }

     System.out.println(count);

  }
}

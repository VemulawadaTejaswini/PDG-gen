import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] a = new int[n];
    for (int i=0;i<n;i++){
      a[i] = scan.nextInt();
    }

    long sum = 0;
    while (true){
      boolean flag = true;
      for (int i=0;i<n;i++){
        if (a[i] == 0){
          if (flag == false){
            break;
          }
        }
        else{
          a[i] -= 1;
          flag = false;
        }
      }

      if (flag == true){
        System.out.println(sum);
        return;
      }

      sum += 1;


    }
  }
}

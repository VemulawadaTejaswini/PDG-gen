import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    // List<Integer> p = new ArrayList<Integer>();
    int[] a = new int[n];
    for(int i=0; i<n; i++){
      a[i] = sc.nextInt();
    }

    int counter = 0;
    for(int i=0; i<n; i++){

      boolean isoFlag = true;
      for(int j=0; j<n; j++){

        if((i != j) && (a[i] % a[j]) == 0){
          // System.out.print(i);
          // System.out.println(j);
          isoFlag = false;
          break;
        }
      }

      if(isoFlag){
        counter++;
      }
    }
    
    System.out.println(counter);

    return;
  }
}
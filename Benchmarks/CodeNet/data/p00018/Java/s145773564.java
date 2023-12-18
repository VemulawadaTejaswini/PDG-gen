import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

class Main{
  public static void main(String[] a){
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    ArrayList<String> alstr = new ArrayList<String>();
    while(sc.hasNext()){
      alstr.add(sc.next());
    }

    int[] foo = null;
    String[] strarr = null;
    int strlen = 0;

    for (String str : alstr) {
      strarr = str.split(" ");
      strlen = strarr.length;
      foo = new int[strlen];

      for (int iter = 0; iter < strlen; iter++) {
        foo[iter] = Integer.parseInt(strarr[iter]);
      }

      Arrays.sort(foo);

      for (int iter = 0; iter < strlen / 2; iter++) {
        int tmp = foo[iter];
        foo[iter] = foo[strlen-iter-1];
        foo[strlen-iter-1] = tmp;
      }

      for (int iter = 0; iter < strlen; iter++) {
        System.out.print(foo[iter]);
        if (iter == strlen-1) System.out.println();
        else System.out.print(" ");
      }
    }
  }
}
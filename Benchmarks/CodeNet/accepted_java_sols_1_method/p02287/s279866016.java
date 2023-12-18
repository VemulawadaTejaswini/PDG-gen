import java.util.*;
import java.io.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.nextLine());
    int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int H[] = new int[n+1];
    for (int i = 0; i < arr.length; i++) {
      H[i+1] = arr[i];
    }

    for(int i=1; i<=n; i++) {
      out.print("node "+i+": ");
      out.print("key = "+H[i]+", ");
      if(i>1)out.print("parent key = "+H[i/2]+", ");
      if(i*2<=n)out.print("left key = "+H[i*2]+", ");
      if(i*2+1<=n)out.print("right key = "+H[i*2+1]+", ");
      out.println();
    }
  }
}


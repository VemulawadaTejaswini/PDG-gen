import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();

    int[] data1 = {1,3,5,7,8,10,12};
    int[] data2 = {4,6,9,11};
    int[] data3 = {2};
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;

    for (int i = 0; i < data1.length; i++) {
      if (data1[i] == x) count1++;
      if (data1[i] == y) count1++;
    }

    for (int i = 0; i < data2.length; i++) {
      if (data2[i] == x) count2++;
      if (data2[i] == y) count2++;
    }

    for (int i = 0; i < data3.length; i++) {
      if (data3[i] == x) count3++;
      if (data3[i] == y) count3++;
    }

    if (count1 == 2 || count2 == 2 || count3 == 2) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }

}

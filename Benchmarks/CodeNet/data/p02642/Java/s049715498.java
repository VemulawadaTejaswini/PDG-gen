
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String[] str = sc.nextLine().split(" ");

    ArrayList<Integer> aList = new ArrayList<Integer>();
    for(int i = 0;i < n;i++) {
      aList.add(Integer.parseInt(str[i]));
    }
    Collections.sort(aList);

    int max = Collections.max(aList);
    boolean[] bArray = new boolean[max+1];

    for(int i = 0;i < max+1 ; i++) {
      if(aList.contains(i)) {
        bArray[i] = true;
      }else {
        bArray[i] = false;
      }
    }

    int num = 0;
    for(int i :aList) {
      if(bArray[i]) {
        if(num != n-1 && i == aList.get(num+1)) {
          bArray[i] = false;
        }
        for(int j = i*2;j <= max; j += i) {
          bArray[j] = false;
        }
      }
      num++;
    }

    int cnt = 0;
    for(int i = 0;i < max+1;i++) {
      if(bArray[i]) {
        cnt++;
      }
    }

    System.out.println(cnt);
    }
}

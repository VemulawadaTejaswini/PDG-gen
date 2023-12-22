import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        List<Integer> heightList = new ArrayList<Integer>();
        for(int k = 0; k <n;k++) {
          heightList.add(scanner.nextInt());
        }
       
        for (int j = n-1; 0 < j; j--) {
          Integer right = Integer.valueOf(heightList.get(j));
          Integer left = Integer.valueOf(heightList.get(j-1));
          int diff = right - left;
          if(diff <= -2) {
            System.out.println("No");
            return;
          } else if(diff == -1) {
            heightList.set(j-1, right);
          }
        }
        System.out.println("Yes");
    }
}
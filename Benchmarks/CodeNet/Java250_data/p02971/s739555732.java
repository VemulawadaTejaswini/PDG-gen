import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for(int index = 0; index < n; index++) {
          list.add(scanner.nextInt());
        }
        
        Integer candidate = Collections.max(list);
        int indexOfCandidate = list.indexOf(candidate);
        list.remove(indexOfCandidate);
        
        Integer secondCandidate = Collections.max(list);
        
        for(int index = 0;index < n; index++) {
          if(index == indexOfCandidate) {
            System.out.println(secondCandidate);
          } else {
            System.out.println(candidate);
          }
        }
}
}
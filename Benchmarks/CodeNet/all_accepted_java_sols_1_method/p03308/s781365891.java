import java.util.*;

public class Main {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         int n = sc.nextInt();
         ArrayList<Integer> list = new ArrayList<>();
         for(int i = 0; i < n; i++) {
             list.add(sc.nextInt());
         }
              
        Integer max = list.stream().max(Comparator.naturalOrder()).get();;
        Integer min = list.stream().min(Comparator.naturalOrder()).get();;
        System.out.println(max - min);
    } 
}
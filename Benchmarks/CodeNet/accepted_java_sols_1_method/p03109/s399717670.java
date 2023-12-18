import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("/");

        List<Integer> list = new ArrayList<>();
        for (String i : s) {
            list.add(Integer.parseInt(i));
        }
      
        String result = "TBD";
        if (list.get(1) < 5) result = "Heisei";
        
        System.out.println(result);
    }
}

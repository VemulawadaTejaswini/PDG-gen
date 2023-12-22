import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
        List<String> xList = new ArrayList<String>();
        for (int i = 0 ; i < 5 ;i++) {
            xList.add(s.next());
        }
        System.out.println(xList.indexOf("0") + 1);
    }
}

import java.util.*;
import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class Main {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        int N = Input.nextInt();
        HashMap<String, Integer> HM = new HashMap();

        for (int I = 0; I < N; I++) {
            String S = Input.next();
            if (!HM.containsKey(S)) {
                HM.put(S, 0);
            }
        }
        System.out.println(HM.size());
    }
}

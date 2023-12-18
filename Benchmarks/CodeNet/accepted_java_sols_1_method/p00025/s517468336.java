
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            List<Integer> A = new ArrayList<>();
            List<Integer> B = new ArrayList<>();

            List<Integer> Aa = new ArrayList<>();
            List<Integer> Ba = new ArrayList<>();

            for (int i = 0; i < 4; i++) A.add(Integer.parseInt(sc.next()));
            for (int i = 0; i < 4; i++) B.add(Integer.parseInt(sc.next()));

            List<Integer> rIndex = new ArrayList<>();

            int hit = 0;
            for (int i = 0; i < 4; i++) {
                if (Objects.equals(A.get(i), B.get(i))) {
                    hit++;
                } else {
                    Aa.add(A.get(i));
                    Ba.add(B.get(i));
                }
            }
            
            int blow = 0;
            for (Integer aB : Ba) {
                if (Aa.contains(aB)) {
                    blow++;
                }
            }



            System.out.printf("%d %d\n", hit, blow);
        }
    }
}
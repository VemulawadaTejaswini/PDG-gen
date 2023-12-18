import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] suuretu = new int[N];
        for (int i = 0 ; i < N ; i++) {
            suuretu[i] = scanner.nextInt();
        }
        int count = 0;
        List<Integer> countList = new ArrayList<>();
        for (int index = 0; index < N ; index++) {
            for (int jdex = 0; jdex < N;jdex++) {
                if (index != jdex) {
//                    System.out.println(suuretu[index] + " " + suuretu[jdex]);
                    if (suuretu[index] % suuretu[jdex] == 0) {
                        countList.add(suuretu[index]);
                        break;
                    }
                }

            }
        }
//        for (Integer info :  countList) {
//            System.out.println(info);
//        }
        System.out.println(N - countList.size());
    }
}

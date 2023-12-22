
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        List<Integer> kudamonoSyuruiList = new ArrayList<>();
        for (int i = 0 ;i < N ; i++) {
            kudamonoSyuruiList.add(scanner.nextInt());
        }
        Collections.sort(kudamonoSyuruiList);
//        for (Integer info : kudamonoSyuruiList) {
//            System.out.println(info);
//        }
        int sum = 0;
        for (int i = 0;i < K ; i++) {
            sum = sum + kudamonoSyuruiList.get(i);
        }
        System.out.println(sum);
    }
}

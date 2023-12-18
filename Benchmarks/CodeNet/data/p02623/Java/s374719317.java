import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int N = scanner.nextInt();
    static int M = scanner.nextInt();
    static long K = scanner.nextLong();
    static List<Long> NTower = new ArrayList<>();
    static List<Long> MTower = new ArrayList<>();
    static int readCount = 0;

    public static void main(String[] args) {

        for (int i = 0; i < N; i++) {
            NTower.add(scanner.nextLong());
        }
        for (int i = 0; i < M; i++) {
            MTower.add(scanner.nextLong());
        }
        for (int i = 0; i < K; i++) {
            int see = 0;
            while (look(see)){
                see++;
            }
            read(see);
        }
        System.out.println(readCount);




    }
    public static boolean look(int see){
        if((NTower.get(see).compareTo(MTower.get(see))) == 0){
            return false;
        }else {
            return true;
        }
    }
    public static void read(int see){
        if((NTower.get(see).compareTo(MTower.get(see))) > 0){
            NTower.remove(0);
        }else {
            MTower.remove(0);
        }
        readCount++;
    }

}

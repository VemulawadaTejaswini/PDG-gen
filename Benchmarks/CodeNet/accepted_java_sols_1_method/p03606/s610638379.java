
import java.util.HashMap;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        HashMap<String, Integer> HM = new HashMap();
        int N = Input.nextInt();
        for (int I = 0; I < N; I++) {
            int X = Input.nextInt();
            int Y = Input.nextInt();
            for (int J = X; J <= Y; J++) {
                if(!HM.containsKey(J+""))
                HM.put(J+"", 0);
            }
        }
        System.out.println(HM.size());
    }
}

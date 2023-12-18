import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        int answer = 0;
        boolean endFlag = false;

        while (true){
            for(int number : list){
                if (number % Math.pow(2, answer + 1) != 0){
                    endFlag = true;
                    break;
                }
            }
            if (endFlag){
                break;
            }
            answer += 1;
        }
        System.out.println(answer);

    }
}

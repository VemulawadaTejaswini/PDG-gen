import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int left;
        int start = -1;
        int result = 0;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(input.nextInt());
        }
        left = 1;

        for (int i = 0; i < N; i++) {
            if (list.get(i) == 1){
                start = i;
                result = i;
                break;
            }
        }

        if (start == list.size() - 1){
            result = 0;
        }else if (start != -1){
            for (int i = start + 1; i < N; i++){
                if (left + 1 != list.get(i)){
                    result ++;
                }else {
                    left++;
                }
            }
        }else {
            result = -1;
        }

        System.out.println(result);
    }
}

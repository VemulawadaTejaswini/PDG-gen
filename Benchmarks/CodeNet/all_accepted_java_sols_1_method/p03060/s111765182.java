import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int maxim = 0;

        List<Integer> num1 = new ArrayList<>();
        List<Integer> num2 = new ArrayList<>();

        for (int i = 0; i < n; i++){
            num1.add(sc.nextInt());
        }
        for (int j = 0; j < n; j++){
            num2.add(sc.nextInt());
        }

        for (int k = 0; k < n; k++){
            if ((num1.get(k) - num2.get(k)) >= 1){
                maxim += (num1.get(k) - num2.get(k));
            }
        }
        System.out.println(maxim);
    }
}

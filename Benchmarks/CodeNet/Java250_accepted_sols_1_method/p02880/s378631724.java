import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        for (int i=1;i<10;i++){
            for (int j=1;j<10;j++){
                num.add(i*j);
            }
        }
        if (num.contains(scanner.nextInt())){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
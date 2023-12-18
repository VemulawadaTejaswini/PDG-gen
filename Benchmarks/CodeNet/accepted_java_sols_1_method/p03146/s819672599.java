import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int num = scan.nextInt();
        List<Integer> memory = new ArrayList<>();
        memory.add(num);

        while(true){
            if(num % 2 == 0){
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            if(memory.contains(num)){
                System.out.println(memory.size() + 1);
                break;
            } else {
                memory.add(num);
            }
        }

    }
}
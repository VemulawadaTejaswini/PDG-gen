import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        scanner.close();
        String combined = input[0] + input[1];
        Integer combinedNum = Integer.parseInt(combined);
        List<Integer> heihou = new ArrayList<>();
        for( int i=1; i<=1000; i++){
            heihou.add(i*i);
        }
        if(heihou.contains(combinedNum)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
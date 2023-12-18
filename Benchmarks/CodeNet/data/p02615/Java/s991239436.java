import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Comparator.reverseOrder;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> inputList = new ArrayList<Integer>();
        for(int i = 0; i < n ;i++) {
            inputList.add(sc.nextInt());
        }

        /*
        List<Integer> sortedList = inputList.stream().sorted(reverseOrder()).collect(Collectors.toList());
        for(int a: sortedList) {
            System.out.println(a);
        }
        */
        int result = inputList.stream().sorted(reverseOrder()).limit(n - 1).mapToInt(a -> a).sum();
        System.out.println(result);
    }
}
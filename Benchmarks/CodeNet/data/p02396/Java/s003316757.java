
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int i = 0;
        do {
            list.add(scan.nextInt());
        } while (!(list.get(i++) == 0));
        
        for (Integer array : list) {
            int j = 1;
            System.out.println("Case "+ j +": "+array);
            j++;
        }
    }

}


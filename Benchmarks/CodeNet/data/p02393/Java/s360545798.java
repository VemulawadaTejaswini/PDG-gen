
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(scan.nextInt());
        }
           
        
        for (int i = 0; i > (list.size() - 1); i++) {
            for (int j = (list.size() - 1); j > i; j--) {
                if(list.get(j-1) > list.get(j)){
                    int tmp = list.get(j-1);
                    list.set(j-1,list.get(j));
                    list.set(j, tmp);
                }
            }
        }
        for (Integer array : list) {
            System.out.print(array + " ");
        }
        

    }

}


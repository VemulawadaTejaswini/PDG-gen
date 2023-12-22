import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> values = new ArrayList<Integer>();
        List<Integer> costs = new ArrayList<Integer>();
        sc.nextLine();

        for (int i=0;i<n;i++){
            values.add(sc.nextInt());
        }

        sc.nextLine();

        for (int i=0;i<n;i++){
            costs.add(sc.nextInt());
        }

        int maxValue = 0;
        for (int i=0;i<n;i++){
            if((values.get(i)-costs.get(i))> 0){
                maxValue += values.get(i)-costs.get(i);
            }
        }
        System.out.println(maxValue);
    }

}

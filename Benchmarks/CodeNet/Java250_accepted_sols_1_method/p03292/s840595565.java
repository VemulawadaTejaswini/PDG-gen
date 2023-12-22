import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        List<Integer> cost = new ArrayList<>();
        
        for(int i = 0; i < 3; i++){
            cost.add(sc.nextInt());
        }
        cost.add(cost.get(0));
        Collections.sort(cost);
        
        int totalCost = 0;
        for(int i = 1; i < cost.size(); i++){
            totalCost += cost.get(i) - cost.get(i - 1);
        }
        
        System.out.println(totalCost);
        
    }
}

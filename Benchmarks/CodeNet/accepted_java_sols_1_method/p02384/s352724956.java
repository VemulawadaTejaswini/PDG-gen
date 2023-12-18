import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> dice = new ArrayList<Integer>();
        for(int i = 0; i < 6; i++){
            dice.add(sc.nextInt());
        }
        int q = sc.nextInt();
        int[] ans = new int[q];
        for(int i = 0; i < q; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int index_a = dice.indexOf(a);
            int index_b = dice.indexOf(b);
            if((index_a == 3 && index_b == 1) || (index_a == 1 && index_b == 2) || (index_a == 2 && index_b == 4) || (index_a == 4 && index_b == 3)){
                ans[i] = dice.get(0);
            }else if((index_a == 0 && index_b == 3) || (index_a == 3 && index_b == 5) || (index_a == 5 && index_b == 2) || (index_a == 2 && index_b == 0)){
                ans[i] = dice.get(1);
            }else if((index_a == 0 && index_b == 1) || (index_a == 1 && index_b == 5) || (index_a == 5 && index_b == 4) || (index_a == 4 && index_b == 0)){
                ans[i] = dice.get(2);
            }else if((index_a == 0 && index_b == 4) || (index_a == 1 && index_b == 0) || (index_a == 5 && index_b == 1) || (index_a == 4 && index_b == 5)){
                ans[i] = dice.get(3);
            }else if((index_a == 0 && index_b == 2) || (index_a == 2 && index_b == 5) || (index_a == 5 && index_b == 3) || (index_a == 3 && index_b == 0)){
                ans[i] = dice.get(4);
            }else if((index_a == 1 && index_b == 3) || (index_a == 3 && index_b == 4) || (index_a == 4 && index_b == 2) || (index_a == 2 && index_b == 1)){
                ans[i] = dice.get(5);
            }
        }
        for(int i = 0; i < q; i++){
            System.out.println(ans[i]);
        }
    }
}

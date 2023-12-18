import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<Integer> sticks = new ArrayList<Integer>();
        for(int i = 0; i< N; i++){
            sticks.add(scan.nextInt());
        }

        scan.close();
        int count = sticks.size();
        int ans = 0;

        if (count < 3){
            System.out.println(0);
            return;
        }

        for (int i = 0; i < count - 2; i++){
            for (int j = i + 1; j < count - 1; j++){
                for (int k = j + 1; k < count; k++){
                    
                    // 異なる数字であるか
                    if(sticks.get(i) == sticks.get(j) || sticks.get(j) == sticks.get(k) || sticks.get(k) == sticks.get(i)){
                        continue;
                    }

                    // 三角形の成立条件を満たすか
                    if(sticks.get(i) + sticks.get(j) > sticks.get(k) && sticks.get(j) + sticks.get(k) > sticks.get(i) && sticks.get(k) + sticks.get(i) > sticks.get(j)){
                        ans++;
                    }

                }
            }
        }

        System.out.println(ans);


    }

}
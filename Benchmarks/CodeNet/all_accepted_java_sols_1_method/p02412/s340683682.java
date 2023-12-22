import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<Integer>();
        while(sc.hasNext()){
            int n = sc.nextInt();
            int x = sc.nextInt();
            if(n == 0 && x == 0){
                break;
            }else{
                numList.add(n);
                numList.add(x);
            }
        }
        for(int i = 0; i < numList.size() / 2; i++){
            int ans = 0;
            int n = numList.get(i * 2);
            int x = numList.get(i * 2 + 1);
            for(int j = 1; j <= n - 2; j++){
                for(int k = j + 1; k <= n - 1; k++){
                    for(int l = k + 1; l <= n; l++){
                        if(j + k + l == x){
                            ans++;
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        // 宣言
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> octBalls = new ArrayList<>();
        
        // 入力値取得
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++){
            octBalls.add(sc.nextInt());
        }
        
        int total = 0;
        int pattern = (n * (n-1)) / 2; 
        // 
        for(int j=0;j<n;j++){
            for(int k=0;k<n;k++){
                if(!(k <= j)){
                    total = total + (octBalls.get(j) * octBalls.get(k));                    
                }
                continue;
            }
        }

        System.out.println(total);
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n,k,q;
        n = sc.nextInt();
        k = sc.nextInt();
        q = sc.nextInt();
        
        ArrayList<Integer> score_list = new ArrayList<Integer>();
        
        for(int i = 0; i < n; i++){
            score_list.add(k-q);
        }
        
        for(int j = 0; j < q; j++){
            int answer = sc.nextInt();
            score_list.set(answer - 1, score_list.get(answer - 1) + 1);
        }
        
        for(int x = 0; x < score_list.size(); x++){
            if(score_list.get(x) <= 0){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }
        
        
    }
}

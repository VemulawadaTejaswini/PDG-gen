import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        for(int a = 1; a <= N; a++){
            int A = sc.nextInt();
            map.put(a,0);
            list.add(A);
        }
        sc.close();
        int listValue = 0;
        for(int z = 1; z <= K; z++){

            for(int i = 1; i <= N; i++){
                listValue = list.get(i-1);
                for(int k = listValue * (-1) ; k <= listValue; k++){
                    if(i + k >= 1 && i + k <= N){
                        map.put(i + k, map.get(i + k) + 1);
                    }
                }
            }

            if(z != K){
                for(int l = 1 ; l <= N; l++){
                    list.set(l-1, map.get(l));
                    map.put(l, 0);
                }
            }else{
                for(int j = 1; j <= N; j++){
                    System.out.println(map.get(j));
                }
            }
        }
    }
}

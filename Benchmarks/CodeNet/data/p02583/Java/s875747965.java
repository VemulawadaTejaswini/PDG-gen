import java.util.*;

public class Main{
    /**
     * メインメソッド
     */
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final ArrayList<Integer> Lengths = new ArrayList<Integer>();
        // while(sc.hasNext()){
        //     Lengths.add(sc.nextInt());
        // }
            for (int i = 0; i < N; i++){
                Lengths.add(sc.nextInt());
            }
        sc.close();
        final int answer = Logics(N, Lengths);
        System.out.println(answer);
    }

    /**
     * ロジック
     */
    public static int Logics(int N, List<Integer> list) {
        int answer = 0;
        for (int i = 0; i < N; i++){
            for (int j = i + 1; j < N; j++){
                for (int k = j + 1; k < N; k++){
                    boolean judge1 = (list.get(i) == list.get(j) || list.get(i) == list.get(k) || list.get(j) == list.get(k));
                    boolean judge2 = (list.get(i) + list.get(j) > list.get(k) && list.get(j) + list.get(k) > list.get(i) && list.get(i) + list.get(k) > list.get(j));
                    if (judge1){
                    } else if(judge2) {
                        answer ++;
                    }
                }
            }
        }
        return answer;
    }
}
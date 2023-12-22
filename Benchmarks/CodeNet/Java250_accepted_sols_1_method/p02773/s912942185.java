import java.util.*;

public class Main {
    public static int Max_cnt = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] S = new String[N];

        for (int i = 0; i < N; i++) {
            S[i] = sc.next();
        }

        Arrays.sort(S);
        //System.out.println(Arrays.toString(S));

        ArrayList<String> Ans = new ArrayList<>();
        String tmp;
        int count = 1;

        for (int i = 0; i < N-1; i++) {
            tmp = S[i];
            if(tmp.equals(S[i+1])){
                count++;
            }else{
                count = 1;
            }

            if(count == Max_cnt){
                Ans.add(tmp);
            }else if(count > Max_cnt){
                Ans.clear();
                Ans.add(tmp);
                Max_cnt = count;
            }
        }

        if(Max_cnt == 1){
            Ans.add(S[N-1]);
        }

        for (int i = 0; i < Ans.size(); i++) {
            System.out.println(Ans.get(i));
        }
    }
}

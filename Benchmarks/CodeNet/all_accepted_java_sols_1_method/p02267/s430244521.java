import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<n;i++) s.add(sc.nextInt());
        ArrayList<Integer> S = new ArrayList<>(s);
        int q = sc.nextInt();
        int T[] = new int[q];
        for(int i=0;i<q;i++)T[i] = sc.nextInt();
        int cnt = 0;
        for(int i=0;i<S.size();i++){
            for(int j=0;j<q;j++){
                if(S.get(i)==T[j]){
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}

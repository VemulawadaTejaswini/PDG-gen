import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<Integer> st = new HashSet<>();
        for(int i=0;i<N;i++){
            st.add(sc.nextInt());
        }
        if(st.size() == N){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
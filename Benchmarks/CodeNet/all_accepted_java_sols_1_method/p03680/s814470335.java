import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> a = new ArrayList<>();
        for (int i=0; i<N; i++){
            a.add(Integer.parseInt(sc.nextLine())-1);
        }
        sc.close();
        int cnt = 0;
        int push = 0;
        while (true){
            cnt++;
            push = a.get(push);
            if (push == 1){
                System.out.println(cnt);
                break;
            }
            if (cnt == N){
                System.out.println(-1);
                break;
            }
        }
    }
}
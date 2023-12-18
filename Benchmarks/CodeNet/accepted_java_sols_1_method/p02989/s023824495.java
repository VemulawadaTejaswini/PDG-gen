import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        System.out.println(list.get(N / 2) - list.get((N / 2) - 1));
    }
}

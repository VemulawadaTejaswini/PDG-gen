import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Deque<Integer> d = new ArrayDeque<>();
        int tmp1 = sc.nextInt();
        d.push(tmp1);
        int tmp2 = 0;
        int answer = 0;
        for(int i = 1;i<n;i++){
            tmp1 = d.getFirst();
            tmp2 = sc.nextInt();
            if(tmp2 == tmp1){
                tmp2 = 0;
                answer++;
            }
            d.push(tmp2);
        }
        System.out.println(answer);
    }
}
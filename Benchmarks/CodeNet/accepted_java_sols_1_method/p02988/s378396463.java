import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int first = sc.nextInt();
        int middle = sc.nextInt();
        int last = 0;
        int cnt = 0;
        for(int i = 2; i < N; i++){
            last = sc.nextInt();
            if((first < middle && middle < last) || (last < middle && middle < first)){
                cnt++;
            }
            first = middle;
            middle = last;
        }
        System.out.println(cnt);
    }
}

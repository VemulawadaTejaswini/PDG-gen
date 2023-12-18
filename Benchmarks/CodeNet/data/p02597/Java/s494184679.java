import java.util.*;

public class Main{

    final static Scanner sc = new Scanner(System.in);
    static int res = 0;
    public static void main(String[] args) {
        System.out.println(D());
    }

    public static int D(){
        int N = Integer.parseInt(sc.next());
        String colors = sc.next();
        char [] stones = new char[N];
        for(var i =0; i< N; i++){
            stones[i] = colors.charAt(i);
        }
        int num = 0;
        for(var i : stones){
            if(i == 'R'){
                num++;
            }
        }
        int cnt = 0;
        for(var i = 0; i< num ; i++){
            if(stones[i] == 'W'){
                cnt++;
            }
        }
        return cnt;
    }

}

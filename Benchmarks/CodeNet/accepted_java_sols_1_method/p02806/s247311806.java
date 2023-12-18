import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //入力曲数
        String array[][] = new String[N][2];
        for(int i=0; i<N;i++){
            array[i][0] = sc.next(); //曲名
            array[i][1] = sc.next(); //再生時間
        }
        String X = sc.next(); //寝落ちしたときの曲
        int time = 0; //寝ていた時の再生時間
        boolean flag = false; //寝たらtrue

        for(int i=0; i<N; i++) {
            if(X.equals(array[i][0])) {
                flag = true;
                continue;
            }
            if(flag == true) {
                int n = Integer.parseInt(array[i][1]);
                time = time + n;
            }
        }
        System.out.println(time);
    }
}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] s = new String[N];
        int[] t = new int[N];
        int totalTime = 0;
        for(int i=0;i<N;i++){
            s[i] = sc.next();
            int time = sc.nextInt();
            totalTime += time;
            if(i>0){
                t[i] = t[i-1] + time;
            } else {
                t[i] = time;
            }
        }
        String X = sc.next();
        for(int i=0;i<N;i++) {
            if(X.equals(s[i])){
                System.out.println(totalTime - t[i]);
                break;
            }
        }
    }

}

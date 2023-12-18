import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static class State implements Comparable<State>{
        int x, y;
        State(int x, int y){
            this.x=x;
            this.y=y;
        }
        public int compareTo(State s) {
            return s.y-this.y;
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            ArrayList<State> state=new ArrayList<State>();
            while(sc.hasNext()) {
                int N=sc.nextInt();
                int M=sc.nextInt();
                if(N+M==0)    break;
                for(int i=0; i<N; i++) {
                    int d=sc.nextInt();
                    int p=sc.nextInt();
                    state.add(new State(d, p));
                }//距離と期待値を一緒にいれる
                Collections.sort(state);
                int count=0;
                int xout=0, yout=0;
                int sum=0;
                for(int i=0; i<N; i++) {
                    xout+=state.get(i).x;
                    yout=state.get(i).y;
                    if(xout>M) {//予算を超えるかどうか
                        if(count==0) {
                            sum+=(xout-M)*yout;
                            count++;
                        }
                        else {
                            sum+=state.get(i).x*yout;
                        }
                    }
                }
                System.out.println(sum);
            }
        }
    }
}

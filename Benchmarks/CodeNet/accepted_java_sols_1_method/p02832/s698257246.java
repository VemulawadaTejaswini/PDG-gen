import java.util.*;

class Main{

    Main(){
        Scanner SC = new Scanner(System.in);
        int N = Integer.parseInt(SC.next());
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = Integer.parseInt(SC.next());
        }

        int val = 1;
        for(int i=0;i<N;i++){
            if(A[i] == val) val++;
        }

        if(val == 1){
            System.out.println(-1);
        } else {
            System.out.println(N-val+1);
        }

    }

    public static void main(String[] args){
        Main main = new Main();
    }
}

import java.util.*;

class Main{
    public Main(){
        Scanner SC = new Scanner(System.in);

        int N = Integer.parseInt(SC.next());
        int M = Integer.parseInt(SC.next());
        int[][] H = new int[N][2];
        for(int i=0;i<N;i++){
            H[i][0] = Integer.parseInt(SC.next());
            H[i][1] = 1;
        }
        int A,B;
        for(int i=0;i<M;i++){
            A = Integer.parseInt(SC.next())-1;
            B = Integer.parseInt(SC.next())-1;
            if(H[A][0] > H[B][0]){
                H[B][1] = 0;
            } else if(H[A][0] < H[B][0]){
                H[A][1] = 0;
            } else {
                H[A][1] = 0;
                H[B][1] = 0;
            }
        }

        int result = 0;
        for(int i=0;i<N;i++){
            if(H[i][1] == 1) result++;
        }

        System.out.println(result);

    }

    public static void main(String args[]){
        Main main = new Main();
    }
}

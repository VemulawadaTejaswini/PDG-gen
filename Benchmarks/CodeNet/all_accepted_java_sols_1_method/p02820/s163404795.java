import java.util.*;

class Main{

    public static void main(String args[]) throws Exception{
        Main main = new Main();
    }

    public Main(){
        Scanner scanner = new Scanner(System.in);
        int[] point = new int[3];
        int N,K;
        String T;
        N = scanner.nextInt();
        K = scanner.nextInt();

        point[0] = scanner.nextInt(); //r
        point[1] = scanner.nextInt(); //s
        point[2] = scanner.nextInt(); //p
        T = scanner.next();

        int[] V = new int[N];

        for(int i=0;i<N;i++){
            switch(T.charAt(i)){
                case 'r':
                    V[i] = 2;
                    break;
                case 's':
                    V[i] = 0;
                    break;
                case 'p':
                    V[i] = 1;
                    break;
            }
        }

        int result = 0;
        boolean[] isWin = new boolean[N];
        for(int i=0;i<K;i++){
            result += point[V[i]];
            isWin[i] = true;
        }
        for(int i=K;i<N;i++){
            if(V[i] == V[i-K] && isWin[i-K]){
                isWin[i] = false;
            } else {
                result += point[V[i]];
                isWin[i] = true;
            }
        }

        System.out.print(result);
    }
}

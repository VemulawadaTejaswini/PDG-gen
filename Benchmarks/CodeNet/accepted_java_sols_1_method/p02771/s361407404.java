import java.util.*;

class Main{

    public Main(){
        int N, M, L;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        L = scanner.nextInt();

        if(N == M & M != L){
                System.out.println("Yes");

        } else if(N == L & N != M){
                System.out.println("Yes");

        } else if(M == L & M != N){

                    System.out.println("Yes");
        } else {
                System.out.println("No");

        }

    }

    public static void main(String args[]) throws Exception{
        Main main = new Main();
    }
}

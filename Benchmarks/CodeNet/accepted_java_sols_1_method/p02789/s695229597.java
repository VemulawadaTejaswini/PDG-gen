import java.util.*;

class Main{

    public static void main(String args[]) throws Exception{
        Main main = new Main();
    }

    public Main(){
        Scanner scanner = new Scanner(System.in);
        int N,M;
        N = Integer.parseInt(scanner.next());
        M = Integer.parseInt(scanner.next());

        if(N == M){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

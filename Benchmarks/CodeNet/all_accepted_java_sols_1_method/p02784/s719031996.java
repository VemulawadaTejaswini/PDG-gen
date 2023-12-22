import java.util.*;

class Main{

    public static void main(String args[]) throws Exception{
        Main main = new Main();
    }

    public Main(){
        Scanner scanner = new Scanner(System.in);
        int H,N;
        H = Integer.parseInt(scanner.next());
        N = Integer.parseInt(scanner.next());
        int total = 0;
        for(int i=0;i<N;i++){
            total += Integer.parseInt(scanner.next());

            if(total >= H){
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
    }
}

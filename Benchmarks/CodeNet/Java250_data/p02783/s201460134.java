import java.util.*;

class Main{

    public static void main(String args[]) throws Exception{
        Main main = new Main();
    }

    public Main(){
        Scanner scanner = new Scanner(System.in);
        int H,A;
        H = Integer.parseInt(scanner.next());
        A = Integer.parseInt(scanner.next());

        int total = 0, result=0;

        while(total < H){
            total += A;
            result++;
        }

        System.out.println(result);
    }
}

import java.util.*;

class Main{

    public static void main(String args[]) throws Exception{
        Main main = new Main();
    }

    public Main(){
        Scanner scanner = new Scanner(System.in);
        int N;
        N = Integer.parseInt(scanner.next());

        int min = Integer.MAX_VALUE;

        int result = 0, in;
        for(int i=0;i<N;i++){
            in = Integer.parseInt(scanner.next());
            if(min >= in){
                result++;
                min = in;
            }
        }

        System.out.println(result);
    }
}

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int N = scanner.nextInt();
        long A = 1;
        for(int i=0;i<N;i++){
            A *= scanner.nextLong();
        }
        if(A>Math.pow(10,18)){
            System.out.println("-1");
        }else{
            System.out.println(A);
        }
    }
}

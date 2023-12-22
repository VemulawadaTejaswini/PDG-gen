import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N >= 0 && N <= 1000){
            System.out.print(1000 - N);
        }else if(N > 1000 && N <= 2000){
            System.out.print(2000 - N);
        }else if(N > 2000 && N <= 3000){
            System.out.print(3000 - N);
        }else if(N > 3000 && N <= 4000){
            System.out.print(4000 - N);
        }else if(N > 4000 && N <= 5000){
            System.out.print(5000 - N);
        }else if(N > 5000 && N <= 6000){
            System.out.print(6000 - N);
        }else if(N > 6000 && N <= 7000){
            System.out.print(7000 - N);
        }else if(N > 7000 && N <= 8000){
            System.out.print(8000 - N);
        }else if(N > 8000 && N <= 9000){
            System.out.print(9000 - N);
        }else if(N > 9000 && N <= 10000){
            System.out.print(10000 - N);
        }
        

    }
}
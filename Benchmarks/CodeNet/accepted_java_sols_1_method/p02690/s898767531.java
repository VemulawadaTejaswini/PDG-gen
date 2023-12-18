import java.util.*;
public class Main {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        for (long i = -1000; i <=1000 ; i++) {
            for (long j = -1000; j <=1000; j++) {
                long a5 = i*i*i*i*i;
                long b5 = j*j*j*j*j;
                if(a5-b5==X){
                    System.out.print(i);
                    System.out.print(" ");
                    System.out.print(j);
                    return;
                }
            }
        }
    }
}
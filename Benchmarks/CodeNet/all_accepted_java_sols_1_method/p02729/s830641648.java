

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int N = sc.nextInt() ,M=sc.nextInt() ,count=0;
       System.out.println( M*(M-1) + ((N-1+M)*(N-M))/ 2 );
    }
    
}

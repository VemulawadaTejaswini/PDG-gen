import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int A = sc.nextInt();
        final int B = sc.nextInt();
        final int C = sc.nextInt();
        final int X = sc.nextInt();
        int count = 0;

        for( int a = 0; a <= A; a++ ){
            for( int b = 0; b <= B; b++ ){
                for( int c = 0; c <= C; c++ ){
                    int sum = 500*a + 100*b + 50*c;
                    if( sum == X ){
                        count++;
                    }
                }       
            }
        }
        System.out.println(count);
    }
}
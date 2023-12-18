import java.util.Scanner;

class Problem {

    public static int sumOf4Int(int n){
        int count = 0;
        if(n > 36){
            return 0;
        }
        for(int a = 0; a < 10; a ++){
            for(int b = 0; b < 10; b ++){
                for(int c = 0; c < 10; c ++){
                    for(int d = 0; d < 10; d ++){
                        if(a + b + c + d == n)
                            count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(sumOf4Int(args[1]));
    }
}
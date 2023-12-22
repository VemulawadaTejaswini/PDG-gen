import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        long l = stdIn.nextInt();
        long r = stdIn.nextInt();
    
        long min = 2018;
        for(long i = l;i < l + 2019 && i < r;i++) {
            for(long j = r;j > r - 2019 && j > i;j--) {
                if((i*j)%2019 < min){
                    min = (i*j)%2019;
                }
            }
        }

        System.out.println(min);
        
        
    }
}


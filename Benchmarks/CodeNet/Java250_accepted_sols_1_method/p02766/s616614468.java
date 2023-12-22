import java.util.Scanner;

class Main{

    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long r = scanner.nextLong();
        scanner.close();
        int count = 0;
        while(n>=r){
            count += 1;
            n = n/r;
        }
        System.out.println(count+1);
    }
}
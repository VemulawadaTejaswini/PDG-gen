import java.util.Scanner;

class Main {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long val = scanner.nextLong();
        scanner.close();
        long sum = 0;
        for(long i=1; i<=val; i++){
            if(i%3!=0 && i%5!=0){
                sum += i;
            }
        }
        System.out.print(sum);
    }
    
}
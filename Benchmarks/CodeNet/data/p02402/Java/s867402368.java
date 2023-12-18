import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int tmp = scanner.nextInt();
        int max = tmp;
        int min = tmp;
        long sum = tmp;
        
        for (int i=1; i<n; i++) {
            tmp = scanner.nextInt();
            if (tmp > max) max = tmp;
            if (tmp < min) min = tmp;
            sum += tmp;
        }

        System.out.println(Integer.toString(min) + " " + Integer.toString(max) + " " + String.valueOf(sum));
    }
}



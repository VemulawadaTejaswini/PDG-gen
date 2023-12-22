import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int[] num = new int[3];
        num[0] = stdIn.nextInt();
        num[1] = stdIn.nextInt();
        num[2] = stdIn.nextInt();
        
        do {
            if (num[0] > num[1]) {
                int n = num[0];
                num[0] = num[1];
                num[1] = n;
            } else if (num[1] > num[2]) {
                int m = num[1];
                num[1] = num[2];
                num[2] = m;
            } else {
            }
            } while(!(num[0]<=num[1] && num[1]<=num[2]));
            
            System.out.println(num[0]+" "+num[1]+" "+num[2]);
    }
}
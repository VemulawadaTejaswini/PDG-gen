import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int oriN = N;

        int count = 0;
        while(N > 0) {
            N/=10;
            count++;
        }
        
       int t = count%2 == 1 ? count-2: count-1;
        
        int n1 = 0;
        for(int i = 1; i<= t; i+=2) {
            n1 += Math.pow(10, i) - Math.pow(10, i)/10;
        }

        int n2 = 0;
        if(count%2 == 1) {
            n2 = oriN - (int)Math.pow(10, count-1) +1;
        }

        System.out.println(n1+n2);
        
    }
}
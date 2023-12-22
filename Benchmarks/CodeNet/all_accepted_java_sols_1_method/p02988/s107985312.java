import java.util.Scanner;

public final class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        
        int n = stdIn.nextInt();
        int[] p = new int[n];
        for(int i=0; i<p.length; i++){
            p[i] = stdIn.nextInt();
        }
        int counter = 0;

        for(int i=1; i<p.length-1; i++){
            if((p[i-1] < p[i] && p[i] <= p[i+1]) || (p[i+1] < p[i] && p[i] <= p[i-1])){
                counter++;
            }
        }

        System.out.println(counter);
    }
}
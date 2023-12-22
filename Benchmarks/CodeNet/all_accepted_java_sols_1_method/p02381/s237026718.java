import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int count = sc.nextInt();
            if (count == 0) break;
            int[] score = new int[count];
            int sum = 0;
            double average = 0;
            for (int i=0; i<count; i++) {
                score[i] = sc.nextInt();
                sum += score[i];
            }  
            average = (double)sum/count;
            double d = 0;
            for (int i=0; i<count; i++) {
                d += (score[i]-average)*(score[i]-average);
            }
            double b = (double)d/count;
            System.out.println(Math.sqrt(b));
        }
    }
}


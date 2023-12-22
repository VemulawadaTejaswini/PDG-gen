import java.util.Scanner;
public class Main { 
    public static void main(String[] args) { 
        try (Scanner sc = new Scanner(System.in)) { 
            while (true) { 
                int n = sc.nextInt(); 
                if (n == 0) { 
                    break; 
                } 
            int[] scores = new int[n]; 
            for (int i = 0; i < scores.length; i++) { 
                scores[i] = sc.nextInt(); 
            } 
            double sum = 0, average = 0, variance = 0, x = 0, xsum = 0; 
            for (int j = 0; j < scores.length; j++) {
                sum+=scores[j];
            }
            average = sum / scores.length;
            for (int k = 0; k < scores.length; k++) {
                x=scores[k]-average;
                xsum+=x*x;
            }
            variance = xsum / scores.length;
            System.out.println(Math.sqrt(variance)); 
            } 
        } 
    } 
}


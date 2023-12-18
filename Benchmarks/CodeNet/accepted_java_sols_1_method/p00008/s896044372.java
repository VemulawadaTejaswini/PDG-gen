import java.util.*;

class Main {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        
        int [] result = new int [51];

        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                for (int c = 0; c < 10; c++) {
                    for (int d = 0; d < 10; d++) {
                        result[a+b+c+d] += 1;
                    }
                }
            }
        }
            
        while (true) {
            int n;
            try {
                n = sc.nextInt();
            } catch (NoSuchElementException e) {
                break;
            }

            System.out.println(result[n]);
        }

    }
}
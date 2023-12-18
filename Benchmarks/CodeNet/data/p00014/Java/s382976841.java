import java.util.*;

class Main {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        int d;

        while (true) {
            try {
                d = sc.nextInt();
            } catch (NoSuchElementException e) {
                break;
            }

            int area = 0; 
            
            for(int x = d; x < 600; x+=d) {
                area += x * x; 
            }

            System.out.println(area * d);

        }
        
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n = Integer.parseInt(line);
        int[] num = new int[n];
        for(int i = 0; i< n; i++) {
            String line1 = sc.nextLine();
            num[i] = Integer.parseInt(line1);
        }
        int min = num[0];
        int max = num[1] - num[0];
        for(int i = 1; i < n; i++) {
            if(num[i] - min > max) {
                max = num[i] - min;
            }
            if(num[i] < min) {
                min = num[i];
            }
            
        }
        System.out.println(max);
            
    }
 }
 

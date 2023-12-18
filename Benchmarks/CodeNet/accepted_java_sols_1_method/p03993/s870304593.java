import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
  
        int array[] = new int[n];
 
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();         
        }

        int ans = 0;
 
        for (int i = 0; i < n; i++) {
            if (array[array[i] - 1] == i + 1) {
                ans++;
            }
        }
 
        System.out.println(ans / 2);
 
        sc.close();
 
        }
 
    }
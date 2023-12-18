import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n = Integer.parseInt(line);
        String line1  = sc.nextLine();
        String[] line1sp = line1.split(" ");
        int[] A =  new int[n];
        for(int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(line1sp[i]);
        }
        for(int i = 0; i < n; i++) {
            System.out.print(A[i]);
            if(i < n - 1) {
                System.out.print(" ");
            }else {
                System.out.println("");
            }
        }
        for(int i = 1; i < n; i++) {
            int v = A[i];
            int j = i - 1;
            while(j >= 0 && A[j] > v) {
                A[j + 1] = A[j];
                j--;
            }
            A[j+1] = v;
            for(int x = 0; x < n; x++) {
            System.out.print(A[x]);
            if(x < n - 1) {
                System.out.print(" ");
            }else {
                System.out.println("");
            }
        }
        }
        
        
        
    }
 }
 

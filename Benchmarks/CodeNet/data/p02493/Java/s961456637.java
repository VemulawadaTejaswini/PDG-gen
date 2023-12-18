import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
 
        int n = sc.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }

         StringBuffer str = new StringBuffer();
        for (int i = n -1; i >= 0; i--) {
            str.append(data[i]);
            if (i != 0) {
                str.append(" ");
            }
        }
        System.out.println(str);
         
        sc.close();
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt(), n = sc.nextInt();
        int array[] = new int[w];
        for (int i = 0; i < w; i++) array[i] = i+1;
        for (int i = 0; i < n; i++){
            String line = sc.next();
            int a = line.charAt(0) - '0' - 1;
            int b = line.charAt(2) - '0' - 1;
            int tmp = array[a];
            array[a] = array[b];
            array[b] = tmp;
        }
        for (int i = 0; i < w; i++){
            System.out.println(array[i]);
        }
    }
}
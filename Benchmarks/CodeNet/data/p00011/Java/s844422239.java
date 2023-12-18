import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int n = sc.nextInt();
        int array[] = new int[w];
        int a, b, tmp;
        String line;
        for (int i = 0; i < w; i++) array[i] = i+1;
        for (int i = 0; i < n; i++){
            line = sc.next();
            a = line.charAt(0) - '0' - 1;
            b = line.charAt(2) - '0' - 1;
            tmp = array[a];
            array[a] = array[b];
            array[b] = tmp;
            for (int j = 0; j < w; j++){
                System.out.printf(" %d",array[j]);
            }
            System.out.printf("\n");
        }
        for (int i = 0; i < w; i++){
            System.out.println(array[i]);
        }
    }
}
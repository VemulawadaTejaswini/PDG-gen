import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int n = sc.nextInt();
        int array[] = new int[w];
        for (int i = 0; i < w; i++) array[i] = i+1;
        for (int i = 0; i < n; i++){
            String str = sc.next();
            String ab[] = str.split(",");
            int a = Integer.parseInt(ab[0]) - 1;
            int b = Integer.parseInt(ab[1]) - 1;
            int tmp = array[a];
            array[a] = array[b];
            array[b] = tmp;
        }
        for (int i = 0; i < w; i++){
            System.out.println(array[i]);
        }
    }
}

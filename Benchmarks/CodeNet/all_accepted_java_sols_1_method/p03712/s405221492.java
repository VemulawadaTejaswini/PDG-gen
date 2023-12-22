import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int w = scan.nextInt();
        char[][] array = new char[h+2][w+2];

        for(int i = 0;i < h+2;i++){
            Arrays.fill(array[i], '#');
        }
        for(int i = 0;i < h;i++){
            String s = scan.next();
            for(int j = 0;j < w;j++){
                array[i+1][j+1] = s.charAt(j);
            }
        }
        for(int i = 0;i < h+2;i++){
            for(int j = 0;j < w+2;j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
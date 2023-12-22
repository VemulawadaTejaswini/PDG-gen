import java.util.*;

class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    char[][] c = new char[h][w];
    for(int i = 0; i < h; i++){
            c[i] = sc.next().toCharArray();
    }
    for(int i = 0; i < 2 * h; i++){
        for(int j = 0; j < w; j++){
            System.out.print(c[i / 2][j]);
            }
        System.out.println("");
    }
}
}

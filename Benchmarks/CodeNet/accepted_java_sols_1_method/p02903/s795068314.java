import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[][] arr = new int[h][w];

        for (int i=0; i<h-b; i++){
            String s = "";
            for (int j=0; j<a; j++){
                s += "1";
            }
            for (int k=0; k<w-a; k++){
                s += "0";
            }
            System.out.println(s);
        }
        for (int i=0; i<b; i++){
            String s = "";
            for (int j=0; j<a; j++){
                s += "0";
            }
            for (int k=0; k<w-a; k++){
                s += "1";
            }
            System.out.println(s);
        }
    }
}
import java.util.*;

class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int tx = sc.nextInt();
        int ty = sc.nextInt();
        int su = ty - sy;
        int sr = tx - sx;

        for(int i = 0; i < su; i++){
            System.out.print("U");
        }
        for(int i = 0; i < sr; i++){
            System.out.print("R");
        }
        for(int i = 0; i < su; i++){
            System.out.print("D");
        }
        for(int i = 0; i < sr; i++){
            System.out.print("L");
        }
        System.out.print("L");
        for(int i = 0; i < su+1; i++){
            System.out.print("U");
        }
        for(int i = 0; i < sr+1; i++){
            System.out.print("R");
        }
        System.out.print("DR");
        for(int i = 0; i < su+1; i++){
            System.out.print("D");
        }
        for(int i = 0; i < sr+1; i++){
            System.out.print("L");
        }
        System.out.print("U");
    }
}
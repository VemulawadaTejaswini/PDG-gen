import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int areaLengthA = sc.nextInt();
        int areaLengthB = sc.nextInt();
        int angelAForB  = sc.nextInt();
        
        //三角形の面積
        double triangleArea = 0.500000 * areaLengthA * areaLengthB * Math.sin(Math.toRadians((double) angelAForB));
        //2辺が決まっている状態で残りの辺
        double lastLength = Math.sqrt( Math.pow((double) areaLengthA, 2) + Math.pow((double)areaLengthB, 2) - 2 * areaLengthA * areaLengthB * Math.cos(Math.toRadians((double) angelAForB)));
        //3辺の長さ
        double triangleLength = lastLength + areaLengthA + areaLengthB;
        //三角形の高さ
        double triangleHeight = 2 * triangleArea / areaLengthA;
        
        System.out.println(triangleArea);
        System.out.println(triangleLength);
        System.out.println(triangleHeight);
    }
}

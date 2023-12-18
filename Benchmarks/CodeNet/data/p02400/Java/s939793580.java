import java.util.*;
import java.lang.*;

public class Main { 
    public static void main(String[] args) { 
    	Scanner sc = new Scanner(System.in); 
        // radius 半径
        Stirng strRadius = sc.nextLine();
    	int radius = parse.double(strRadius);

        // 面積 = 半径 * 半径 * Pi
        double area = radius * radius * Math.PI;
        // 円周 = 直径 * Pi
        double leng = (radius *2)* Math.PI;

        System.out.println(area + " " + leng);
    }
}



import java.util.Scanner;

/**
 * C5
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        double[] vec1 = {0, 0};
        double[] vec2 = {100, 0};
        print(vec1);
        koh(vec1, vec2, n);
        print(vec2);
    }

    public static double[] rotate(double[] vec1, double[] vec2){
        double[] vec3 = new double[2];
        vec3[0] = 0.5*(vec2[0]-vec1[0]-root3*vec2[1]+root3*vec1[1]) + vec1[0];
        vec3[1] = 0.5*(vec2[1]-vec1[1]+root3*vec2[0]-root3*vec1[0]) + vec1[1];
        return vec3;
    }

    private static double root3 = Math.pow(3, 0.5);

    private static void koh(double[] vec1, double[] vec2, int time){
        if(--time < 0) return;
        double[] vecl = {(2*vec1[0]+vec2[0])/3, (2*vec1[1]+vec2[1])/3};
        double[] vecr = {(vec1[0]+2*vec2[0])/3, (vec1[1]+2*vec2[1])/3};
        double[] vecc = rotate(vecl, vecr);
        koh(vec1, vecl, time);
        print(vecl);
        koh(vecl, vecc, time);
        print(vecc);
        koh(vecc, vecr, time);
        print(vecr);
        koh(vecr, vec2, time);
    }

    private static void print(double[] vec){
        System.out.println(vec[0] + " " + vec[1]);
    }
}


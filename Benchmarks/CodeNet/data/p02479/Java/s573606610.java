import java.util.Scanner;

class Main{
	public static final double b = Math.PI;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double syu;
        double men;
        syu = a * (double)2 * b;
        men = a * a * b;
        System.out.printf("%f %f", syu, men);
    }
}
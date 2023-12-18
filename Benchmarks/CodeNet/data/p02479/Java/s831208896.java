import java.util.Scanner;


class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double circ, area, r = sc.nextInt(), pi = Math.PI;
        circ = 2 * r * pi;
        area = r * r * pi;
        
        System.out.println(area + " " +circ);
    }
}
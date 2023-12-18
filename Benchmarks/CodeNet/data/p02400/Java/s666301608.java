import java.util.Scanner;
class Main {
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        double radius = scanner.nextInt();
        double pi = 3.141592653589;
        double are = radius*radius*pi;
        double cir = 2*radius*pi;
        String area = String.format("%.6f", are);
        String circ = String.format("%.6f", cir);
         
        System.out.println(area+" "+circ);
    }   
}
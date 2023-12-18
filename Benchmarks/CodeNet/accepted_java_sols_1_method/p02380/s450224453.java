import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String inputArr[] = input.split(" ");
        
        double a = Double.parseDouble(inputArr[0]);
        double b = Double.parseDouble(inputArr[1]);
        double c = Double.parseDouble(inputArr[2]);
        
        double S = a * b * Math.sin(Math.toRadians(c)) / 2;
        System.out.println(String.format("%.8f", S));
        
        double x =  Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2*a*b*Math.cos(Math.toRadians(c)) );
        double L = a+b+x;     
        System.out.println(String.format("%.8f", L));
        
        double h = 2 * S / a; 
        System.out.println(String.format("%.8f", h));
    }
}

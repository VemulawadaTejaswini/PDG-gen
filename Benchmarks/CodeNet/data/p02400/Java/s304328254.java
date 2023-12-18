import java.util.Scanner;
 
class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float r = scan.nextFloat();
         
        float men1 = (float) (r * r * 3.14159265359);
        float syu1 = (float) (2 * r * 3.14159265359);
         
        String syu2 = String.format("%.5f", syu1);
        String men2 = String.format("%.5f", men1);
        System.out.println(men2 + " " + syu2);
         
    }
}
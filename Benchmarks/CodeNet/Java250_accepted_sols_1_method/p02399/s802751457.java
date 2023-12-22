import java.util.Scanner;
import java.text.DecimalFormat;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int inta = sc.nextInt();
        int intb = sc.nextInt();
        if(inta<1 || 1e9<inta){
            System.exit(-1);
        }else if(intb<1 || 1e9<intb){
            System.exit(-1);
        }
        double doublea = inta;
        double doubleb = intb;
        DecimalFormat n = new DecimalFormat();
        System.out.println(inta/intb + " " + inta%intb + " " + String.format("%f", doublea/doubleb));
    }
}
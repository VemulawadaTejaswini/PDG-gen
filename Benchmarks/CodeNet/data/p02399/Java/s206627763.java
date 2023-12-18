import java.util.Scanner;

class Main{
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
        System.out.println(inta/intb + " " + inta%intb + " " + doublea/doubleb);
    }
}
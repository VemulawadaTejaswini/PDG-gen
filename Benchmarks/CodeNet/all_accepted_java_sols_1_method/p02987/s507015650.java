import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        boolean f0 =  str.charAt(0)==str.charAt(1) && str.charAt(2)==str.charAt(3);
        boolean f1 = str.charAt(0)==str.charAt(2) && str.charAt(1)==str.charAt(3);
        boolean f2 =  str.charAt(0)==str.charAt(3) && str.charAt(1)==str.charAt(2);
        boolean nf =  str.charAt(0)==str.charAt(1) && str.charAt(0) == str.charAt(2);
        if((f0 || f1 || f2) && !nf){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

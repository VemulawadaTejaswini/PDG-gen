import java.util.Scanner;


public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(str.charAt(str.length()-1)=='3'){
            System.out.println("bon");
        }if(str.charAt(str.length()-1)=='0' ||  str.charAt(str.length()-1)=='1' ||  str.charAt(str.length()-1)=='6' || str.charAt(str.length()-1)=='8'){
            System.out.println("pon");
        }if(str.charAt(str.length()-1)=='2' || str.charAt(str.length()-1)=='4' || str.charAt(str.length()-1)=='5' || str.charAt(str.length()-1)=='7' || str.charAt(str.length()-1)=='9'){
            System.out.println("hon");
        }
    }
}


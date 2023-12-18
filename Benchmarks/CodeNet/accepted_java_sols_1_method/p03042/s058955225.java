import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        int num1=Integer.parseInt(S.substring(0,2));
        int num2=Integer.parseInt(S.substring(2));

        if(1<=num1 && num1<=12  && 1<=num2 && num2<=12){
            System.out.println("AMBIGUOUS");
        }else if(1<=num1 && num1<=12 ){
            System.out.println("MMYY");
        }else if(1<=num2 && num2<=12 ){
            System.out.println("YYMM");
        }else{
            System.out.println("NA");
        }


    }
}
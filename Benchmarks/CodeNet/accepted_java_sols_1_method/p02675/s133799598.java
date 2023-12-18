import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        int n = Integer.valueOf(S.substring(S.length()-1));
        if(n==2||n==4||n==5||n==7||n==9){
            System.out.println("hon");
        }else if(n==3){
            System.out.println("bon");
        }else{
            System.out.println("pon");
        }
    }
}

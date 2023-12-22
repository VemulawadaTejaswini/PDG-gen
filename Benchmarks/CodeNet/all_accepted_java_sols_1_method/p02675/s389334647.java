import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        if(str.matches(".*2$") || str.matches(".*4$") || str.matches(".*5$") || str.matches(".*7$") || str.matches(".*9$")){
            System.out.println("hon");
        }
        else if(str.matches(".*0$") || str.matches(".*1$")  || str.matches(".*6$") || str.matches(".*8$")){
            System.out.println("pon");
        }
        else{
            System.out.println("bon");
        }
    }
}
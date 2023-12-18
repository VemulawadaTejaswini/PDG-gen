
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String N = sc.next();
        char n[] = N.toCharArray();
        if (n.length == 1){
            if (n[0]=='0'||n[0]=='1'||n[0]=='6'||n[0]=='8'){
                System.out.println("pon");
            } else if (n[0]=='2'||n[0]=='4'||n[0]=='5'||n[0]=='7'||n[0]=='9'){
                System.out.println("hon");
            } else if (n[0]=='3'){
                System.out.println("bon");
            }
        } else if (n.length == 2){
            if (n[1]=='0'||n[1]=='1'||n[1]=='6'||n[1]=='8'){
                System.out.println("pon");
            } else if (n[1]=='2'||n[1]=='4'||n[1]=='5'||n[1]=='7'||n[1]=='9'){
                System.out.println("hon");
            } else if (n[1]=='3'){
                System.out.println("bon");
            }
        } else if (n.length == 3){
            if (n[2]=='0'||n[2]=='1'||n[2]=='6'||n[2]=='8'){
                System.out.println("pon");
            } else if (n[2]=='2'||n[2]=='4'||n[2]=='5'||n[2]=='7'||n[2]=='9'){
                System.out.println("hon");
            } else if (n[2]=='3'){
                System.out.println("bon");
            }
        }
    }
}

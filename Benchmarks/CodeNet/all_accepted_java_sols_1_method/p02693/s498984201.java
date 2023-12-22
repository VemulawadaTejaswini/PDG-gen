import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scaner = new Scanner(System.in);
        var k = Integer.parseInt(scaner.nextLine());
        var a_b = scaner.nextLine().split(" ");
        var a = Integer.parseInt(a_b[0]);
        var b = Integer.parseInt(a_b[1]);
        
        int i = 1;
        boolean isOK = false;
        for(;i*k<=b; i++) {
            var r = k*i;
            if(a <= r && r <= b) {
                System.out.println("OK");
                isOK = true;
                break;
            } 
        }

        if (!isOK) {
            System.out.println("NG");
        }

        scaner.close();

    }
}

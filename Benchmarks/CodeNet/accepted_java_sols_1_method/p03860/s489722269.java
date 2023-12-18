import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String[] str = (scan.nextLine()).split(" ");
        String res = str[0].substring(0, 1) + str[1].substring(0, 1) + str[2].substring(0, 1);

        System.out.println(res);
        scan.close();

        
    }


}
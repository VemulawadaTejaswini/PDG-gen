import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        String s = scanner.next(), ans = "Heisei";
        if(s.charAt(5) == '1')ans = "TBD";
        else if(s.charAt(6) > '4')ans = "TBD";

        System.out.println(ans);
    }

}

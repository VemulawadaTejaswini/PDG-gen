import java.util.*;
class Main{
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);
        int A =  Integer.parseInt(scan.next());
        int B =  Integer.parseInt(scan.next());
        scan.close();
        int number_power_strips = 0;
        int power_outlet = 1;
        while(power_outlet < B){
            number_power_strips++;
            power_outlet += A - 1;
        }
        System.out.println(number_power_strips);
    }
}
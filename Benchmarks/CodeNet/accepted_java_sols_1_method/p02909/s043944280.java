import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s[]={"Sunny", "Cloudy", "Rainy"};
        String ip=in.nextLine();
        if(s[0].contains(ip)){
            System.out.println(s[1]);
        }
        else if(s[1].contains(ip)){
            System.out.println(s[2]);
        }else{
            System.out.println(s[0]);
        }
    }
}
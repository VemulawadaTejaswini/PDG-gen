
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String strInput = input.nextLine();
        int hour = Integer.parseInt(strInput)/3600;
        int min = (Integer.parseInt(strInput)%3600)/60;
        int sec = (Integer.parseInt(strInput)%3600)%60;
        System.out.println(hour + ":" + min + ":" + sec);
    }
}

import java.util.Scanner;

public class Main{
    public static void main(String[] hides){
        Scanner s = new Scanner(System.in);

        String str = s.next();
        switch (str){
            case "MON":
                System.out.print("6");
                break;
            case "TUE":
                System.out.print("5");
                break;
            case "WED":
                System.out.print("4");
                break;
            case "THU":
                System.out.print("3");
                break;
            case "FRI":
                System.out.print("2");
                break;
            case "SAT":
                System.out.print("1");
                break;
            case "SUN":
                System.out.print("7");
                break;

        }
    }
}

import java.util.Scanner;

public class Main {
    static int c0=0;
    static int c1=0;
    static int c2=0;
    static int c3=0;


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        while(testCases-- >= 0){
            String input = sc.nextLine();

            if(input.equals("AC"))
                c0++;
            else if(input.equals("WA"))
                c1++;
            else if(input.equals("TLE"))
                c2++;
            else if(input.equals("RE"))
                c3++;
        }

        System.out.println("AC x " + c0);
        System.out.println("WA x " + c1);
        System.out.println("TLE x "+ c2);
        System.out.println("RE x "+ c3);
    }
}

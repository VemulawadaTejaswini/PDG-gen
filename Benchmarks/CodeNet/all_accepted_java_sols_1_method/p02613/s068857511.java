import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int c0 = 0 , c1 =0,c2=0,c3 = 0;
        String s;
        for(int i = 0; i < n; i++){
             s = input.next();
            if(s.equals("AC"))
                c0++;
            else if(s.equals("WA"))
                c1++;
            else if(s.equals("TLE"))
                c2++;
            else if(s.equals("RE"))
                c3++;
        }
        System.out.println("AC" + " x " + c0);
        System.out.println("WA" + " x " + c1);
        System.out.println("TLE" + " x " + c2);
        System.out.println("RE" + " x " + c3);

    }

    }

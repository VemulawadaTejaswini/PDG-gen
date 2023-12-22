import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n++;
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        while(n-->0){
            String s = sc.nextLine();
            if(s.contains("AC")){
                count++;
            }
            else if(s.contains("WA")){
                count1++;
            }
            else if(s.contains("TLE")){
                count2++;
            }
            else if(s.contains("RE")){
                count3++;
            }

        }
        System.out.println("AC" + " x " + count);
        System.out.println("WA" + " x " + count1);
        System.out.println("TLE" + " x " + count2);
        System.out.println("RE" + " x " + count3);
    }
}
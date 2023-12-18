import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int AC=0;
        int WA=0;
        int TLE=0;
        int RE=0;
        for(int i = 0;i <= A;i++){
            String B = sc.nextLine();
            if(B.equals("AC")){
                AC++;
            }else if(B.equals("WA")){
                WA++;
            }else if(B.equals("TLE")){
                TLE++;
            }else if(B.equals("RE")){
                RE++;
            }
        }
        System.out.println("AC" + " x " +AC);
        System.out.println("WA"+ " x " +WA);
        System.out.println("TLE"+ " x " +TLE);
        System.out.println("RE"+ " x " +RE);
    }
}

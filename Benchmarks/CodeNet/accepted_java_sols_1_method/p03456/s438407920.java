import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        String str1 = stdIn.next();
        String str2 = stdIn.next();
        String str = str1 + str2;
        int num = Integer.parseInt(str);
        double sq = Math.sqrt(num);
        int sq2 = (int)sq;
        if(num == sq2*sq2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

}
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String ans = "ABC";
        if(s.equals("ABC")){
            ans = "ARC";
        }
        System.out.println(ans);
    }
}
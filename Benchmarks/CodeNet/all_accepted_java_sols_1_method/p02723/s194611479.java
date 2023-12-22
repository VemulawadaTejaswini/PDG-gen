import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        char[] str=scn.next().toCharArray();
        if ( str[2]==str[3] &&str[4]==str[5]){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        
    }
}
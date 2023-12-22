import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] ch = sc.next().toCharArray();

        boolean judge = false;
        if(ch[2] == ch[3] && ch[4] == ch[5]){
            judge = true;
        }
        System.out.println(judge ? "Yes" : "No");
    }
}
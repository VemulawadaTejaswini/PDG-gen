import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] strChar = new char[str.length()];
        for(int i = 0; i<str.length(); i++){
            strChar[i] = str.charAt(i);
        }

        boolean judge = false;
        if(strChar[2] == strChar[3]){
            if(strChar[4] == strChar[5]){
                judge = true;
            }
        }
        System.out.println(judge ? "Yes" : "No");
    }
}
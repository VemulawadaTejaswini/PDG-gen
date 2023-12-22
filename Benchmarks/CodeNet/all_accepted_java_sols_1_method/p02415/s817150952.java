import java.util.Scanner;
import java.util.Formatter;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Formatter fm = new Formatter();
        String str1 = sc.nextLine();
        String str2 = "";
        for(int i=0;i<str1.length();i++){
            char c = str1.charAt(i);
            char d;
            if(Character.isLowerCase(c)){
                d = Character.toUpperCase(c);
            }else{
                d = Character.toLowerCase(c);
            }
            fm.format(str2 + "%c", d);
        }
        System.out.println(fm);
    }
}

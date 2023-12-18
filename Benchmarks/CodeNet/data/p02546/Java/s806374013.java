import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] strChar = new char[str.length()];
        for(int i = 0; i<str.length(); i++){
            strChar[i] = str.charAt(i);
        }
        if(strChar[str.length()-1] == 's'){
            System.out.println(str + "es");
        }
        else{
            System.out.println(str + "s");
        }
    }
}
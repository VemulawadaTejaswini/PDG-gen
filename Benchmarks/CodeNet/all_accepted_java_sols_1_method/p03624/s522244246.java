import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();
        String result = "None";
        String c;
        for(int i = 0; i < 26; i++){
            c = String.valueOf((char)(97 + i));
            if(!input.contains(c)){
                result = c;
                break;
            }
        }
        System.out.println(result);
    }

}

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String arr ="abcdefghijklmnopqrstuvwxyz";
    static char alArr[] = arr.toCharArray();
    public static void main(String[] args) {
        String str = "";
        while (sc.hasNext()){
            String aa =  sc.next();
            str += aa;
        }
        str = str.toLowerCase();
        char strarr[] = str.toCharArray();
        for (int i = 0; i < arr.length(); i++){
            int count = 0;
            for (int j = 0; j < str.length(); j++){
                if(strarr[j]==alArr[i]){
                     count++;
                 }
            }
            System.out.println(alArr[i] + " : " + count);
        }
    }
}


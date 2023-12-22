import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s  = new Scanner(System.in);
        String str = s.nextLine();
        String up  = str.toUpperCase();
        String low = str.toLowerCase();
        int i;
        for(i=0;i<str.length();i++){
            if(str.charAt(i)==up.charAt(i))System.out.print(low.charAt(i));
            else System.out.print(up.charAt(i));
        }
        System.out.println();
    }
}

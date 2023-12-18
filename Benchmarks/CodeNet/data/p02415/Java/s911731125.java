import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new java.util.Scanner(System.in);
        String str = scan.nextLine();
        for(int i = 0; i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                System.out.print(Character.toLowerCase(str.charAt(i)));
            }else{
                System.out.print(Character.toUpperCase(str.charAt(i)));
            }
        }
        System.out.println();
    }
}
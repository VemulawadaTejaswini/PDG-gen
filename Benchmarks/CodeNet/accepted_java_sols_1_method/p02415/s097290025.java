import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();


        for (int i = 0; i < line.length(); i++) {//文字が小文字であるかを検討
            if( Character.isLowerCase(line.charAt(i))){
                System.out.print(Character.toUpperCase(line.charAt(i)));
            }else if( Character.isUpperCase(line.charAt(i))){//文字が大文字であるかを検討
                System.out.print(Character.toLowerCase(line.charAt(i)));
            }else{
                System.out.print(line.charAt(i));
            }

        }

        System.out.println();

    }
}

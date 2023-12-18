import java.util.Scanner;

class Main{
    public static void main(String[] a){
        Scanner s = new Scanner(System.in);

        String str = s.next();

        for(int i = str.length() - 1;i >= 0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println("");
    }
}
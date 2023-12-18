import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char[]  c= new char[str.length()];
        for(int i=0;i<str.length();i++){

            c[i] = str.charAt(i);
            if(Character.isLowerCase(c[i])){
                c[i]=Character.toUpperCase(c[i]);
            }
            else if(Character.isUpperCase(c[i])){
                c[i]=Character.toLowerCase(c[i]);
            }
        }
        for(int i=0;i<str.length();i++){
            System.out.print(c[i]);
        }
        System.out.println();

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        String s=scan.nextLine();
       for(int i=0;i<s.length();i++){
           char a =s.charAt(i);
           if('a'<= a && a<='z'){
               System.out.print(Character.toUpperCase(a));
           }else if('A'<= a && a<='Z'){
               System.out.print(Character.toLowerCase(a));
           }else{
               System.out.print(a);
           }
       }
        System.out.println();
    }
}


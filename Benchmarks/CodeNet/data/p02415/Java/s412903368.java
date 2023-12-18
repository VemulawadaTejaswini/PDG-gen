import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        for(int i=0;i<line.length();i++){
            char ch = line.charAt(i);
            if(Character.isLowerCase(ch)){
                String s = String.valueOf(ch);
                s = s.toUpperCase();
                System.out.printf("%s",s);
            }else if(Character.isUpperCase(ch)){
                String s = String.valueOf(ch);
                s = s.toLowerCase();
                System.out.printf("%s",s);
            }else{
                System.out.printf("%c",ch);
            }
        }
        System.out.println();
    }
}

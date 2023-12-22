import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int i,j;
        
        Scanner sc=new Scanner(System.in);
        
        String str;
        Character c;
        str=sc.nextLine();
        for(i=0;i<str.length();i++){
            c=str.charAt(i);
            if(Character.isUpperCase(c))System.out.printf("%c",Character.toLowerCase(c));
            else if(Character.isLowerCase(c))System.out.printf("%c",Character.toUpperCase(c));
            else System.out.printf("%c",c);
        }
        System.out.printf("\n");
    }
}


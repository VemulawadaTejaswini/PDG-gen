import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                c = Character.toLowerCase(c);
            }else if(Character.isLowerCase(c)){
                c = Character.toUpperCase(c);
            }
            sb.append(c);
        }
        System.out.println(sb.toString());
        
    }
}



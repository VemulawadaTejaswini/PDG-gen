import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        StringBuffer sb = new StringBuffer(str);
        for (int i=0; i<sb.length(); i++) 
        { 
            char c = sb.charAt(i);
            if (Character.isLowerCase(c)) {
                sb.setCharAt(i, Character.toUpperCase(c));
            } else {
                sb.setCharAt(i, Character.toLowerCase(c));
            }
        } 
        System.out.println(sb); 
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();
        String s1 = String.valueOf(n.charAt(0));
        int i1=0;
        int i2=0;
        String s2="";
        for(int i=0;i<n.length();i++){
            if(String.valueOf(n.charAt(i)).equals(s1)){
                i1++;
            }else{
                if (s2.equals("") || String.valueOf(n.charAt(i)).equals(s2)) {
                    s2=String.valueOf(n.charAt(i));
                    i2++;
                }
            }
        }
        System.out.println(i1==2&&i2==2?"Yes":"No");
    }
}
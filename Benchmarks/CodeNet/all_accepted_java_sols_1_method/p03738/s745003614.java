import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        if(a.equals(b)){
            System.out.println("EQUAL");
        }else if(a.length()>b.length()){
            System.out.println("GREATER");
        }else if(a.length()<b.length()){
            System.out.println("LESS");
        }else{
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)>b.charAt(i)){
                    System.out.println("GREATER");
                    return;
                }else if(a.charAt(i)<b.charAt(i)){
                    System.out.println("LESS");
                    return;
                }
            }
        }
    }
}

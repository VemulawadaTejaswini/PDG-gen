import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int n=(int)'A';
        for(int i=0;i<26;i++){
            if(s.replaceAll(Character.toString((char)(n+i)), "").length()!=2&&s.replaceAll(Character.toString((char)(n+i)), "").length()!=4){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

}
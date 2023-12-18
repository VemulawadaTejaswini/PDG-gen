import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] s2=sc.next().toCharArray();
        char[] s=sc.next().toCharArray();
        int cou=0;
        for(int i=0;i<3;i++){
            if(s[i]==s2[i])cou++;
        }
        System.out.println(cou);
    }
}

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=String.valueOf(n);
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(ch[i]=='1'){
                ch[i]='9';
            }
            else{
                ch[i]='1';
            }
        }
        s=String.valueOf(ch);
        System.out.println(s);
    }
}
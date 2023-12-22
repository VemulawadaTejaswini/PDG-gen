        import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int o=sc.nextInt();
        String s=sc.next();
        String tmp=String.valueOf(s.charAt(o-1));
        tmp=tmp.toLowerCase();
        String s2=s.substring(0,o-1)+tmp+s.substring(o);
        System.out.println(s2);
    }
}

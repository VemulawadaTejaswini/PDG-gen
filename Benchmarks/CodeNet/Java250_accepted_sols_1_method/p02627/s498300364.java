import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char a = s.charAt(0);
        char aa = 'a';
        char zz = 'z';
        int nu = aa;
        int zu = zz;
        int che = a;
        if(nu <= che && che <= zu){
            System.out.println("a");
        }else{
            System.out.println("A");
        }
        sc.close();
    }
}
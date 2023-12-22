import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        String s=in.nextLine();
        int len=s.length();
        char ch[]=s.toCharArray();
        String s1="";
        String ss="...";
        if(len>n){
            for (int i = 0; i <n; i++) {
                s1=s1+ch[i];
            }
            s1=s1+ss;
            System.out.println(s1);
        }else{
            System.out.println(s);
        }
    }
}
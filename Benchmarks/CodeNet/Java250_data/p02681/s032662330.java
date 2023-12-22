import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1=in.nextLine();
        String s2=in.nextLine();
        StringBuilder sb=new StringBuilder(s1);
        sb.append(s2.charAt(s2.length()-1));
        if(s2.contains(sb)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
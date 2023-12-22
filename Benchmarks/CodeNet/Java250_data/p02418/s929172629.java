import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String s1=s+s;
        String check=in.nextLine();
        if(s1.contains(check)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}


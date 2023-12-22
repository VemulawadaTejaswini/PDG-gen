
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.next();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){

            str.append('x');
        }
        System.out.println(str);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        char []array=in.next().toCharArray();
        int result=0;
        for(char c:array){
            result+= c-'0';
        }
        System.out.println( result%9 ==0?"Yes":"NO");


    }
}

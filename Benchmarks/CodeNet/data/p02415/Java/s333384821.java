import java.util.Scanner;
import java.util.TreeSet;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String a=sc.nextLine();
       for(int i=0;i<a.length();i++){
           char x=a.charAt(i);
           if('a'<=x&&x<='z'){
               x-=32;
               System.out.print(x);
           }else if('A'<=x&&x<='Z'){
               x+=32;
               System.out.print(x);
           }else System.out.print(x);
       }
       System.out.println();
}

}


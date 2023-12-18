import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String w = sc.next().toLowerCase();
        String t;
        int count = 0;

        while( !((t=sc.next()).equals("END_OF_TEXT")) ){
            if(t.toLowerCase().equals(w)) count++;
        }

        System.out.println(count);
    }
}
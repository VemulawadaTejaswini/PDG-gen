import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String give = sc.next();
        int i=0;
        while(!(give.equals("END_OF_TEXT"))){
            if(give.equalsIgnoreCase(a)){
                i++;
            }
            give = sc.next();
        }
        System.out.println(i);
        sc.close();
    }
}

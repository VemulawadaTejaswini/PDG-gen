import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        String t = null;
        int count = 0;
        while(true){
            t = sc.next();
            if(t.equals("END_OF_TEXT")) {
            	break;
            }
            t =  t.toLowerCase();
            if(t.equals(w)){
                count++;
            }
        }
        System.out.println(count);
    }
}

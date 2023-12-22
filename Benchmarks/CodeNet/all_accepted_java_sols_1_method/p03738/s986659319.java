import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        String out = "EQUAL";
        if(a.length() != b.length()){
            if(a.length() > b.length()){
                out = "GREATER";
            }else{
                out = "LESS";
            }
            System.out.println(out);
            System.exit(0);
        }else{
            if(a.compareTo(b) < 0){
                out = "LESS";
            }else if(a.compareTo(b) > 0){
                out = "GREATER";
            }
        }
        System.out.print(out);
    }
}
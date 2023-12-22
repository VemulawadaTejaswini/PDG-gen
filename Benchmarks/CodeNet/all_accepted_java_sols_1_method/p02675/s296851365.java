import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int target = c.nextInt();
        String t = target+"";
        int first = Integer.parseInt(t.substring(t.length()-1));
        if(first == 3){
            System.out.println("bon");
        }else if(first == 0 || first == 1 || first == 6 || first == 8){
            System.out.println("pon");
        }else{
            System.out.println("hon");
        }
    }
}
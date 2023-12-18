import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = s.length();
        //System.out.println(s.substring(l - 1, l));
        if(s.substring(l - 1, l).equals("s")){
            System.out.print(s);
            System.out.println("es");
        }else{
            System.out.print(s);
            System.out.println("s");
        }
    }
}


import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner Ent = new Scanner(System.in);
        int t = Ent.nextInt();
        String p = Ent.next();
        if(p.substring(0,t/2).equals(p.substring(t/2,t))){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
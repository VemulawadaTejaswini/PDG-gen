import java.util.*;
public class  Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder aans = new StringBuilder("");
        StringBuilder bans = new StringBuilder("");
        for(int i=0; i<a; i++){
            aans.append(b+"");
        }
        for(int i=0; i<b; i++){
            bans.append(a+"");
        }
        if(aans.toString().compareTo(bans.toString()) >= 0)
            System.out.println(bans);
        else
            System.out.println(aans);
    }
}
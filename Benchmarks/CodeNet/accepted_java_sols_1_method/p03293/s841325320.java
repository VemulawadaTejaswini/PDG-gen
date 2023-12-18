import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        String new_s = s + s;
        if(new_s.contains(t)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
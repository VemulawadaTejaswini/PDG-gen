import java.util.*;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        String t="None";
        for(int i=97;i<123;i++){
            if(!s.contains(String.valueOf((char)i))){
                t=String.valueOf((char)i);
                break;
            }
        }
        System.out.println(t);
    }
}

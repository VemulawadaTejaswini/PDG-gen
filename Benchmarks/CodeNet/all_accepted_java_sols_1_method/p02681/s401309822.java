import java.util.*;

public class Main {
    public static void main(String[] args){

        int count=0;
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        if(s2.startsWith(s1)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

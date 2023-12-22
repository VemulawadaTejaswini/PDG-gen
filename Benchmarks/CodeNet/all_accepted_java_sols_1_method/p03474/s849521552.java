import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        String s=sc.next();
        try{
            Integer.parseInt(s.substring(0,a));
            if(s.charAt(a)!='-')throw new Exception();
            Integer.parseInt(s.substring(a+1));
            System.out.println("Yes");
        }catch(Exception e){
            System.out.println("No");
        }
    }

}
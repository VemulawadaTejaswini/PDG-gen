import java.util.*;

class Main{
    static Long n;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Integer k = sc.nextInt();
        String s = sc.next();

        if(s.length()>k){
            System.out.println(s.substring(0, k) + "...");
        }
        else{
            System.out.println(s);
        }

    }

}

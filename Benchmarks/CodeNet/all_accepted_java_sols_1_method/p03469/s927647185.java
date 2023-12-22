import java.util.*;
 
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.replaceAll("2017/01","");
        System.out.println("2018/01"+s);
    }
}
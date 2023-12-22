import java.util.*;

class Main{
    static Long n;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        Integer p = Integer.parseInt(n.substring(n.length()-1, n.length()));
        String res = "hon";
        if(p==0|p==1|p==6|p==8){
            res = "pon";
        }
        else if(p==3){
            res = "bon";
        }
        System.out.println(res);
    }

}

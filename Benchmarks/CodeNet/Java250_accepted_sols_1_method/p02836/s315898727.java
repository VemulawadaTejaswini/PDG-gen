import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.next();
        char[] c = a.toCharArray();
        int cou=0;
        for(int i=0;i<c.length;i++){
            if(i>=c.length-i-1)break;
            if(c[i]==c[c.length-i-1]){

            }else{
                cou++;
            }
        }
        System.out.println(cou);
    }
}

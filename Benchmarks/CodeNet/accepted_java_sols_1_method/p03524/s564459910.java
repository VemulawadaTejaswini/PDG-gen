import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int a = 0;
        int b = 0;
        int c = 0;
        for(char ch : s){
            if(ch == 'a'){
                a++;
            }else if(ch == 'b'){
                b++;
            }else{
                c++;
            }
        }
        int chk = 0;
        if(a != 0) chk++;
        if(b != 0) chk++;
        if(c != 0) chk++;
        if(chk == 3 && Math.abs(a-b) <= 1 && Math.abs(b-c) <= 1 && Math.abs(c-a) <= 1){
            System.out.print("YES");
        }else if(chk == 2 && a+b+c == 2 || chk == 1 && a+b+c == 1){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}
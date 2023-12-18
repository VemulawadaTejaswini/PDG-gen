import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String find = "x";
        int count = 0;
        int index = 0;

        while(index != -1){
            index = S.indexOf(find, index);

            if(index != -1){
                index ++;
                count ++;
            }
        }
        if(8 <= count){
            System.out.print("NO");
        }else{
            System.out.print("YES");
        }
    }
}


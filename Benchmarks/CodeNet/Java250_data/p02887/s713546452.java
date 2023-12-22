//20:32~
import java.util.*;

public class Main{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
        String s = sc.next();

        char c = ' ';
        int count = 0;
        for(int i = 0; i < n; i++){
            if(c == s.charAt(i)){

            }else{
                c = s.charAt(i);
                count++;
            }
        }

        System.out.println(count);

    }

}

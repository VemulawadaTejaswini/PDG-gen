
import java.util.*;
import java.lang.*;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int check = 0;

        for(int i = 0; i < S.length(); i += 2){
            if(S.charAt(i) == 'L'){
                check = 1;
            }
        }
        for(int i = 1; i < S.length(); i += 2){
            if(S.charAt(i) == 'R'){
                check = 1;
            }
        }

        if(check == 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");

        }



    }
}





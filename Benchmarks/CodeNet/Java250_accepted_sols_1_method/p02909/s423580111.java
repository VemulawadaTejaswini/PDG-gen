
import java.util.*;
import java.lang.*;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String s[] =  {"Sunny", "Cloudy", "Rainy"};

        if(S.equals(s[0])){
            System.out.println(s[1]);
        }
        if(S.equals(s[1])){
            System.out.println(s[2]);
        }
        if(S.equals(s[2])){
            System.out.println(s[0]);
        }



    }
}





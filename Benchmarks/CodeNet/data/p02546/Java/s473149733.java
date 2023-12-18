import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        //int N = sc.nextInt();
        //int K = sc.nextInt();

        String S = sc.next();

        String res;
        if(S.charAt(S.length()-1)=='s'){
            res = "es";
        }else{
            res="s";
        }

        res = S + res;
        System.out.println(res);
        }
    }
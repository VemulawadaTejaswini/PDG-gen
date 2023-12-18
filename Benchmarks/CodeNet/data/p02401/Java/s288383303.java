
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.sql.Array;
import java.util.*;

public class Main {

    static long gcd (long a, long b) {return b>0?gcd(b,a%b):a;}
    static long lcm (long a, long b) {return a*b/gcd(a,b);}

    public static void main(String[] args){
	// write your code here
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        while(true){
            int a = sc.nextInt();
            String s= sc.next();
            int b =sc.nextInt();
            if(s.equals("+")){
                arrayList.add(a+b);
            }else if(s.equals("-")){
                arrayList.add(a-b);
            }else if(s.equals("/")){
                arrayList.add(a/b);
            }
            else if(s.equals("*")){
                arrayList.add(a*b);
            }else{
                break;
            }
        }
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }
}


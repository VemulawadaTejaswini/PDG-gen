import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Deque;
public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scan = new Scanner(System.in);
String S=scan.next();
        String T=scan.next();
int M=0;
        for(int i=0;i<S.length()-T.length()+1;i++){
            String J=S.substring(i,i+T.length());
            int m=0;
            for(int j=0;j<T.length();j++){
                if(T.substring(j,j+1).equals(J.substring(j,j+1))){m++;}
            }
            if (m>M){M=m;}
        }
        System.out.println(T.length()-M);
    }}
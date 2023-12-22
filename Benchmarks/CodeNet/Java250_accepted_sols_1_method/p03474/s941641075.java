import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A,B,accept=0;
        String S;
        A=sc.nextInt();
        B=sc.nextInt();
        S=sc.next();
        for(int a=0;a<A+B+1;a++){
            if(S.charAt(a)=='-') accept++;
        }
        if(S.charAt(A)=='-'&&accept==1) System.out.println("Yes");
        else System.out.println("No");
    }
}
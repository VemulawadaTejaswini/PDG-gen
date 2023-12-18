import java.util.Scanner;
/*
 * @author Parvez
 */
public class codeforces {
public static void main(String[] args) {
Scanner scn = new Scanner(System.in);

    int sm=0;
    String s=scn.next();
    for(int i=0;i<s.length();i++){
        sm+=s.charAt(i)-'0';
    }
    if(sm%9==0){
        System.out.print("Yes");
    }
    else System.out.print("No");

}}

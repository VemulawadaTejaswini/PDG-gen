//package basics.AtCoders;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Integer n=s.nextInt();
        int sum=0;
        for(int i=0;i<n.toString().length();i++){
            sum = sum + Integer.parseInt(String.valueOf(n.toString().charAt(i)));;
        }
        System.out.println((sum%9==0)?"YES":"NO");
    }
}

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        String s = scan.next();
        for(int i = 1; i < s.length() + 1; i++){
            if(i == k){
                if(s.charAt(k - 1) == 'A'){
                    System.out.print('a');
                }else if(s.charAt(k - 1) == 'B'){
                    System.out.print('b');
                }else{
                    System.out.print('c');
                }
            }else{
                System.out.print(s.charAt(i - 1));
            }
        }
    }
}
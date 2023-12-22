import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split("");
        for(int i = 0; i < strs.length; i++) {
            System.out.print(strs[strs.length - 1 - i]);
        }
        System.out.println("");
    
    }
 } 

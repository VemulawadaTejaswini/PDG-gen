import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i =0;i < s.length() ;i++){
            if(i % 2 != 0){
                if(!s.substring(i,i+1).equals("L") && !s.substring(i,i+1).equals("U") && !s.substring(i,i+1).equals("D")){
                    System.out.println("No");
                    return;
                }
            }else{
                if(!s.substring(i,i+1).equals("R") && !s.substring(i,i+1).equals("U") && !s.substring(i,i+1).equals("D")){
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
        return;
    }
}
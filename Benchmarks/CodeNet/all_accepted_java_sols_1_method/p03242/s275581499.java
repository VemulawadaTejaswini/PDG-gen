import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String input2 = sc.nextLine();
        int len = input2.length();
        int input = Integer.parseInt(input2);
        int judge [] = new int[len];
        for(int i = 0 ; i<len; i++){
            judge[i]=input%10;
            input = input/10;
        }
        for(int i = len-1 ; i>=0 ; i--){
            System.out.print(10-judge[i]);
        }
    //    System.out.print("1");
    //    System.out.print("2");
    }
}
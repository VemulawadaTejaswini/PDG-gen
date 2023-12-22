import java.util.*;
 

public class Main {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.equals("100")||s.equals("010")||s.equals("001")){
            System.out.println(1);
        }else if(s.equals("011")||s.equals("101")||s.equals("110")){
        System.out.println(2);
        }else if(s.equals("000")){
        System.out.println(0);
        }else if(s.equals("111")){
            System.out.println(3);
        }


		
    }
}


import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String S[] = s.split("/");

        if(S[0].equals("2019") != true)
            System.out.println("Heisei");

        else{
            if(S[1].equals("01") || S[1].equals("02") || S[1].equals("03") || S[1].equals("04"))
                System.out.println("Heisei");
            else
                System.out.println("TBD");
        }
        
    }
}
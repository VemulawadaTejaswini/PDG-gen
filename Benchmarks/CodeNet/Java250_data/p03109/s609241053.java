import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        if(Integer.parseInt(a.substring(5,7))<=4 && Integer.parseInt(a.substring(8,10)) <=30){
            System.out.println("Heisei");
        }else{
            System.out.println("TBD");
        }
        
    }

}

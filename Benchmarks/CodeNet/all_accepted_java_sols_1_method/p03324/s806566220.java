import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        String K = sc.next();
        if(N.equals("0")){
            if(K.equals("100")){
                System.out.println(101);
            }else{
                System.out.println(K);
            }
        }else if(N.equals("1")){
            if(K.equals("100")){
                System.out.println(10100);
            }else{
                System.out.println(K+"00");
            }
        }else{
            if(K.equals("100")){
                System.out.println(1010000);
            }else{
                System.out.println(K+"0000");
            }
        }
   }
}
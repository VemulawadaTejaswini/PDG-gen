import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String a = in.next();
        int an = 0;
         while(!a.equals("0")){
             int d = a.length();
             for(int i=0; i<d; i++){
                 an+=a.charAt(i)-'0';
         }
        System.out.println(an);
        an=0;
        a=in.next();                                                        
        }
    }
}
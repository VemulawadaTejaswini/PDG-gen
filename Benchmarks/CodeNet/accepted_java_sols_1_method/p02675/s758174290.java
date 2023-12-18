
import java.util.Scanner;


public class Main {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int s = n.length();
        String jude = n.substring(s-1, s);
        int ans = Integer.parseInt(jude);
        if(ans==3){
            System.out.println("bon");
        }else if(ans==0 || ans==1 || ans==6 || ans==8){
            System.out.println("pon");
        }else{
            System.out.println("hon");
        }
    
        sc.close();
    }
}

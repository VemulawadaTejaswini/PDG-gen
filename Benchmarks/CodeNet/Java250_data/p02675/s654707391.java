import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       String name;
       N = N%10;
       if(N==3){
           name="bon";
       }else if(N==0 || N==1 || N==6 || N==8){
           name = "pon";
       }else{
           name = "hon";
       }
       System.out.println(name);
       
        }
    
}

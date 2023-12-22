import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        
        if(N.equals("RRR")){
            System.out.println("3");
        }else if(N.equals("SRR")||N.equals("RRS")){
            System.out.println("2");
        }else if(N.equals("RSS")||N.equals("SRS")||N.equals("SSR")||N.equals("RSR")){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
        
        
    }
}

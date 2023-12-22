import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] cf = {1,2,3,4,5,6,7,8,9,10,12,14,15,16,18,20,21,24,25,27,28,30,32,35,36,40,42,45,48,49,54,56,63,64,72,81};
        boolean ok = false;
        
        for(int i = 0; i < cf.length;i++){
            if(n == cf[i]) ok = true;
        }
        
        if(ok){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String N=sc.next();
        String[] num = N.split("");
        long count = 0;
        
        for(int i=0;i<num.length;i++){
            count+= Long.parseLong(num[i]);
        }
        
        
        if(count%9==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

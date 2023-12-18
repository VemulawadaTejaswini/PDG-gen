import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int K=sc.nextInt();
        String s=sc.next();
        
        if(s.length()>K){
            for(int i=0;i<K;i++){
                System.out.print(s.charAt(i));
            }
            System.out.println("...");
        }else{
            System.out.println(s);
        }
    }
}

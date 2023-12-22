import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        long K=sc.nextLong();
        if(K==1){
            System.out.println(s.charAt(0));
        }else{
            int i=0;
            while(i<K&&s.charAt(i)=='1'){
                i++;
            }
            if(i==K){
                System.out.println(s.charAt((int)(K-1)));
            }else{
                System.out.println(s.charAt(i));
            }
        }
    }
}

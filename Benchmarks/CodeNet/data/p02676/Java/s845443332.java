import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String su = sc.next();
        String[] s = su.split("",0);
        
        if(s.length<=k){
            System.out.println(su);
        }else{
            for(int i = 0;i < k;i++){
                System.out.print(s[i]);
            }
            System.out.println("...");
        }
    }
}
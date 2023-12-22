import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        
        String[] s = sc.next().split("");
        
        if(!s[A].equals("-")){
            System.out.println("No");
            return;
        }
        
        for(int i=0; i<A; i++){
            if(s[i].equals("-")){
                System.out.println("No");
                return;
            }
        }
        
        for(int i=1; i<=B; i++){
            if(s[i + A].equals("-")){
                System.out.println("No");
                return;
            }
        }
        
        System.out.println("Yes");
    }
}
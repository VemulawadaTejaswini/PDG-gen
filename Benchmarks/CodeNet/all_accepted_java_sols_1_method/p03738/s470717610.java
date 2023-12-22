import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] A = sc.next().split("");
        String[] B = sc.next().split("");
        
        int ans = 0;
        
        if(A.length == B.length){
            for(int i=0; i<A.length; i++){
                if(Integer.parseInt(A[i]) == Integer.parseInt(B[i])){
                    ans++;
                }else if(Integer.parseInt(A[i]) > Integer.parseInt(B[i])){
                    System.out.println("GREATER");
                    return;
                }else{
                    System.out.println("LESS");
                    return;
                }
            }
        }else if(A.length > B.length){
            System.out.println("GREATER");
            return;
        }else{
            System.out.println("LESS");
            return;
        }
        
        if(ans == A.length){
            System.out.println("EQUAL");
        }
    }
}
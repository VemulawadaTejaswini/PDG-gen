import java.util.*;
 
class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
 
        String N = sc.next();
        String a = "7";
 
        for(int i=0; i<3; i++){
            if(N.charAt(i)==a.charAt(0)){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
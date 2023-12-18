import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        String N = sc.next();
        int x = 1; 
        
        for(int i=0; i<3; i++){
            if(N.charAt(i)==N.charAt(i+1)){
                x += 1;
            }
        }
        if(x>=3 && N.charAt(1)==N.charAt(2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
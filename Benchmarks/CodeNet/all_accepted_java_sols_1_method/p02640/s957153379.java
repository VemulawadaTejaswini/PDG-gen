import java.util.*;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
 
    int cou = 0;
    for(int i=0; i<=x; i++){
        if(y == i*2+(x-i)*4){
            cou++;   
        }        
}
        if(cou>0){
       	System.out.println("Yes");
        }else{
        System.out.println("No");
    }
}
}

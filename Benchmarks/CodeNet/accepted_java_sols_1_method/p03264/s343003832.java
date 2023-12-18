import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
 
    int gu =K/2;
    if(K%2==0){
		System.out.println(gu*gu);
    }else{
        System.out.println(gu*(gu+1));
    }
}
}
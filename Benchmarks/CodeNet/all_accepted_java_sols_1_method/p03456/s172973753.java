import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String sum = a + b;
        
        if(Math.sqrt(Integer.parseInt(sum))%1 == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

import java.util.*;

public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x == 25){
            System.out.println("Christmas");
        }else if(x==24){
            System.out.println("Christmas Eve");
        }else if(x==23){
            System.out.println("Christmas Eve Eve");
        }else{
            System.out.println("Christmas Eve Eve Eve");
        }
    }
}

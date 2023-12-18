import java.util.*;

public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        boolean ans=false;
        int n=sc.nextInt();
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                if(n==i*j){
                    ans=true;
                }
            }
        }
        if(ans)System.out.println("Yes");
        else System.out.println("No");




        sc.close();
    }
}

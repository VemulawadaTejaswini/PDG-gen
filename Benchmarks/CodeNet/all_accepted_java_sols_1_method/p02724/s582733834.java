import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int ans=0;
        
        for(int i=0; x>499; i++){
            x=x-500;
            ans+=1000;
        }
        
        for(int i=0; x>4; i++){
            x=x-5;
            ans+=5;
        }
        
        System.out.println(ans);
	}
}
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s = sc.next();
        int k = sc.nextInt();
        int ans=0;
        
        for(int i=0; i<n; i++){
            if(s.charAt(k-1)==s.charAt(i)){
                System.out.print(s.charAt(i));
            }else{
                System.out.print('*');
            }
        }
		
	}
}

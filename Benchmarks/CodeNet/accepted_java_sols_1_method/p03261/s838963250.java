import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n= sc.nextInt();
        String[] w = new String[n];
        w[0] = sc.next();
        String ans = "No";
        
        for(int i=1; i<n; i++){
            w[i] = sc.next();
            for(int j=0; j<i; j++){
                if(w[i].equals(w[j])){
                    System.out.println(ans);
                    return;
                }
            }
            if(w[i].charAt(0)!=w[i-1].charAt(w[i-1].length()-1)){
                System.out.println(ans);
                return;
            }
        }
        
        System.out.println("Yes");
        
	}
}
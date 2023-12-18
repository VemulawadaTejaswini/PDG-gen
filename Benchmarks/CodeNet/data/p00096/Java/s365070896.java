import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        while(sc.hasNext()){
        	long n = sc.nextInt();
        	if(n>2000) n = 4000-n;
        	long ans = (n*n*n + 6*n*n + 11*n + 6) / 6;            
            System.out.println(ans);
        }
    }
}
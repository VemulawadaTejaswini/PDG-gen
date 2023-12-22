import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[]ss = S.toCharArray();
        
        Arrays.sort(ss);
        if(ss[0]==ss[1] && ss[2]==ss[3] && ss[0]!=ss[3]){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
	}
}
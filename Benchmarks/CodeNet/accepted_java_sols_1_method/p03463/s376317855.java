import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        String res;
        if((B-A-1)%2==0){
            res = "Borys";
        }else{
            res = "Alice";
        }
        
        System.out.println(res);
        
        }
    }
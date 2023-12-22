import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int res=1;
        
        for(int i=2; i<100; i++){
            for(int j=2; j<11; j++){
                if(Math.pow(i,j)<=N){
                    res = (int)Math.max(res,Math.pow(i,j));
                }else{
                    break;
                }
            }

        }

        System.out.println(res);
        
        
        
        
        
        }
    }
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long all=1;
        long res;
        long zero=1;
        long nine=1;
        long zeronine=1;

  
        for(int i=0; i<N; i++){
            all = (all*10)%((long)Math.pow(10,9)+7);
        }

        for(int i=0; i<N; i++){
        zero = (zero*9)%((long)Math.pow(10,9)+7);
        }
        
        nine = zero;

        for(int i=0; i<N; i++){
            zeronine = (zeronine*8)%((long)Math.pow(10,9)+7);
        }

        res = (all -zero -nine + zeronine)%((long)Math.pow(10,9)+7);
        if(res<0){
            res = (long)Math.pow(10,9)+7+res;
        }
        
        System.out.println(res);
        
        }
    }
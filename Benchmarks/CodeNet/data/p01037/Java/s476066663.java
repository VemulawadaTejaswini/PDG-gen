import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
 
public class Main {
	
	
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        final int N = sc.nextInt();
        final int M = sc.nextInt();
        
        boolean[] colored = new boolean[N];
        
        for(int i = 0; i < M; i++){
        	final int a = sc.nextInt();
        	final int L = sc.nextInt();
        	
        	for(int j = 0; j < L; j++){
        		final int index = (a + j) % N;
        		
        		colored[index] = true;
        	}
        }
        
        int false_pos = -1;
        for(int i = 0; i < N; i++){
        	if(!colored[i]){
        		false_pos = i;
        		break;
        	}
        }
        
        if(false_pos == -1){
        	System.out.println(N + " " + 1);
        	return;
        }
        
        int[] counts = new int[N];
        int count = 0;
        boolean prev = false;
        for(int i = 0; i < N; i++){
        	final int index = (i + false_pos) % N;
        	
        	if(colored[index]){
        		if(!prev){
        			prev = true;
        		}
        		count++;
        	}else{
        		if(prev){
        			prev = false;
        			counts[count]++;
        			count = 0;
        		}
        	}
        }
        
        if(count != 0){
        	counts[count]++;
        	count = 0;
        }
        //System.out.println(Arrays.toString(colored));
        
        for(int i = N - 1; i >= 0; i--){
        	if(counts[i] > 0){
        		System.out.println(i + " " + counts[i]);
        	}
        }
        
    }
     
} 

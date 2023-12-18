import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
 
 
public class Main {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
        	final int n = sc.nextInt();
        	
        	if(n == 0){
        		break;
        	}
        	
        	double[] pos = new double[9];
        	
        	for(int i = 0; i < 9; i++){
        		pos[i] = 0;
        	}
        	
        	final int start = sc.next().toCharArray()[0] - 'A';
        	final int end = sc.next().toCharArray()[0] - 'A';
        	final int not = sc.next().toCharArray()[0] - 'A';
        	
        	pos[start] = 1;
        	
        	double[] next = new double[9];
        	
        	for(int i = 0; i < n; i++){
        		
        		for(int j = 0; j < 9; j++){
        			next[j] = 0;
        		}
        		
        		//System.out.println(Arrays.toString(pos));
        		
        		for(int j = 0; j < 9; j++){
        			if(j % 3 != 0){
        				if(not != j-1){
        					next[j-1] += pos[j] / 4;
        				}
        			}
        			
        			if(j % 3 != 2){
        				if(not != j+1){
        					next[j+1] += pos[j] / 4;
        				}
        			}
        			
        			if(j / 3 != 0){
        				if(not != j-3){
        					next[j-3] += pos[j] / 4;
        				}
        			}
        			
        			if(j / 3 != 2){
        				if(not != j+3){
        					next[j+3] += pos[j] / 4;
        				}
        			}
        		}
        		
        		double[] tmp = next;
        		next = pos;
        		pos = tmp;
        	}
        	//System.out.println(Arrays.toString(pos));
        	System.out.println(pos[end]);
        }
    }
 
}
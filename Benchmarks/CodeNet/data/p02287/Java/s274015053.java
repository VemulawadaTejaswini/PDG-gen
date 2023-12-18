import java.util.*;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int[] tree = new int[N+1];
        for(int i = 1; i < N+1; i++){
        	tree[i] = sc.nextInt();
        }
        
        for(int i=1; i < N+1; i++){
        	System.out.print("node " + (i) + ": key = " + tree[i] + ", ");
        	int parent = parent(i);	if(0     < parent     ){System.out.print("parent key = " + tree[parent] + ", ");}
        	int left   = left(i);   if(left  < tree.length){System.out.print("left key = "   + tree[left]   + ", ");}
        	int right  = right(i);  if(right < tree.length){System.out.print("right key = "  + tree[right]  + ", ");}
        	System.out.println();
        }
    }

    private static int parent(int i){
    	return i / 2;
    }
    
    private static int left(int i){
    	return 2 * i;
    }
    
    private static int right(int i){
    	return 2 * i + 1;
    }
}
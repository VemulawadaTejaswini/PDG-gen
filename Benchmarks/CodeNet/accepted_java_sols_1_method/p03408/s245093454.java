import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] blue = new String[N];
        for(int i=0; i<N; i++){
        	blue[i] = new String(sc.next());
        }
        int M = sc.nextInt();
        String[] red = new String[M];
        for(int i=0; i<M; i++){
        	red[i] = new String(sc.next());
        }
        int count = 0;
        int max = 0;
        for(int i=0; i<N; i++){
        	count = 0;
        	String one = blue[i];
        	for(int j=0; j<N; j++){
        		if(blue[j].equals(one)){
        			count++;
        		}
        	}
        	for(int j=0; j<M; j++){
        		if(red[j].equals(one)){
        			count--;
        		}
        	}
        	
        	if(count > max)
        		max = count;
        }
        System.out.println(max);
 
	}
 
}
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] balls = new int[N];
        for(int i=0;i<N;i++){
        	balls[i]=sc.nextInt();
        }
        Arrays.sort(balls);
        ArrayList<Integer> kind = new ArrayList<>();
        int count=1;
        for(int i=1;i<N;i++){
        	if(balls[i]==balls[i-1]){
        		count++;
        	}else{
        		kind.add(count);
        		count=1;
        	}
        }
        kind.add(count);
        
        Integer[] array = new Integer[kind.size()];
        array = kind.toArray(array);
        Arrays.sort(array);
        
        
        
        if(array.length<=K) System.out.println(0);
        else{
        	int ans = 0;
        	for(int i=0;i<array.length-K;i++)ans+=array[i];
        	System.out.println(ans);
        }
    }
}
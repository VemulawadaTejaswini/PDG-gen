import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int k = sc.nextInt();
		Long[] a = new Long[x];
		Long[] b = new Long[y];
		Long[] c = new Long[z];
		for(int i = 0; i < x; i++){
		    a[i] = sc.nextLong();
		}
		for(int i = 0; i < y; i++){
		    b[i] = sc.nextLong();
		}
		for(int i = 0; i < z; i++){
		    c[i] = sc.nextLong();
		}
		
		// 計算
		Arrays.sort(a, Comparator.reverseOrder());
		Arrays.sort(b, Comparator.reverseOrder());
		Arrays.sort(c, Comparator.reverseOrder());
		PriorityQueue<Long[]> pq = new PriorityQueue<Long[]>((s, t) -> Long.compare(t[0], s[0]));
		HashSet<String> hs = new HashSet<String>();
		Long[] cakes = new Long[4];
		cakes[0] = a[0] + b[0] + c[0];
		cakes[1] = 0L;
		cakes[2] = 0L;
		cakes[3] = 0L;
		pq.add(cakes);
		hs.add(Arrays.toString(cakes));
		for(int i = 0; i < k; i++){
		    Long[] now = pq.poll();
		    System.out.println(now[0]);
		    if(now[1] < x - 1){
		        Long[] cakesA = new Long[4];
		        cakesA[0] = a[now[1].intValue() + 1] + b[now[2].intValue()] + c[now[3].intValue()];
		        cakesA[1] = now[1] + 1;
		        cakesA[2] = now[2];
		        cakesA[3] = now[3];
		        //System.out.println("A:" + Arrays.toString(cakesA));
		        if(!hs.contains(Arrays.toString(cakesA))) {pq.add(cakesA); hs.add(Arrays.toString(cakesA));}
		    }
		    if(now[2] < y - 1){
		        Long[] cakesB = new Long[4];
		        cakesB[0] = a[now[1].intValue()] + b[now[2].intValue() + 1] + c[now[3].intValue()];
		        cakesB[1] = now[1];
		        cakesB[2] = now[2] + 1;
		        cakesB[3] = now[3];
		        //System.out.println("B:" + Arrays.toString(cakesB));
		        if(!hs.contains(Arrays.toString(cakesB))) {pq.add(cakesB); hs.add(Arrays.toString(cakesB));}
		    }
		    if(now[3] < z - 1){
		        Long[] cakesC = new Long[4];
		        cakesC[0] = a[now[1].intValue()] + b[now[2].intValue()] + c[now[3].intValue() + 1];
		        cakesC[1] = now[1];
		        cakesC[2] = now[2];
		        cakesC[3] = now[3] + 1;
		        //System.out.println("C:" + Arrays.toString(cakesC));
		        if(!hs.contains(Arrays.toString(cakesC))) {pq.add(cakesC); hs.add(Arrays.toString(cakesC));}
		    }
		    
		}
		
		// 出力
		//System.out.println(result);
        
	}
}

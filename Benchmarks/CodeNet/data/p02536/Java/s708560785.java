import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
      	int m = sc.nextInt();
      	int ngs[] = new int[n];
      	List gpList = new ArrayList<Long>();
      	int grp = 1;
      	int cg = 0;
      	int a,b;
        long lstack;
      
      	Arrays.fill(ngs,0);
      	for(int i = 0; i < m;i++){
          a = sc.nextInt()-1;
          b = sc.nextInt()-1;
          if(ngs[a] == 0 && ngs[b] == 0){
            ngs[a] = grp;
            ngs[b] = grp;
            grp++;
          } else if(ngs[a] == 0){
            ngs[a] = ngs[b];
          } else if(ngs[b] == 0){
            ngs[b] = ngs[a];
          } else if(ngs[a] != ngs[b]){
            if(ngs[a] > ngs[b]) lstack = (long)ngs[a]*m + ngs[b];
            else lstack = (long)ngs[b]*m + ngs[a];
            gpList.add(lstack);
          }
        }
      	Collections.sort(gpList);
      	gpList.add(0L);
      	lstack = (long)gpList.get(0);
      	for(int i = 1;i < gpList.size();i++){
          if(lstack != (long)gpList.get(i)){
            cg++;
            lstack = (long)gpList.get(i);
          }
        }
          
      	System.out.println(grp - cg - 1);
	}
}
//20200517 D
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		List[] e=new List[n];
		for(int i=0;i<n;i++){
			e[i]=new ArrayList<Integer>();
		}
		int[] q=new int [n];
      	int a;
      	int b;
		for(int i=0;i<m;i++){
			a=sc.nextInt();
			b=sc.nextInt();
          	e[a-1].add(b);
          	e[b-1].add(a);
        }
      	int h=0; 
        int f=0;
        q[0]=1;
      	boolean[] v=new boolean[n];
      	v[0]=true;
      	List<Integer> t;
      	int s;
      	int[] ans=new int[n-1];
		while(h<n){
           // System.out.println(h);
 			t=e[q[h]-1];
			for(int i=0;i<t.size();i++){
              	s=t.get(i);
            	if(!v[s-1]){
                  f++;
                	q[f]=s;
                  	v[s-1]=true;
                  	ans[s-2]=q[h];
                }
            }
          	h++;
        } 
        if(true){
			System.out.println("Yes");
          for(int i=0;i<n-1;i++){
			System.out.println(ans[i]);
		  }
		}else{
			System.out.println("No");
		}
    }
}
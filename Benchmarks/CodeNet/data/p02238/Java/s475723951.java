import java.util.Scanner;
public class Ex3_2 {
	
	
	
	public static void main(String args[]){
		
		Scanner stdin = new Scanner(System.in);
		
		int count=1;
		int[] fs,es,before;
		int[][] next;
		int n=stdin.nextInt();
		fs=new int[n+1];es=new int[n+1];before=new int[n+1];
		next=new int[n+1][];
		IntStack stack=new IntStack(n);
		
		
		fs[0]=es[0]=before[0]=-1;
		
		for(int i=1;i<=n;i++){
			stdin.nextInt();
			int size=stdin.nextInt();
			
			if(size==0) next[i]=null;
			else{
				next[i] =new int[size];
				for(int j=0;j<size;j++){
					next[i][j]=stdin.nextInt();
				}
			}
			fs[i]=es[i]=before[i]=0;
		}
		
		
		function(1,fs,es,next,count,stack);
		System.out.println(es[3]);
		print(fs,es);
		
		
		
	}
	
	public static boolean isEmp(int id,int[] a,int[] es){
		if(a==null) return true;
		for(int i=0;i<a.length;i++){
			if(es[a[i]]==0) return false;
		}
		return true;
	}
	
	public static void function(int id,int[] fs,int[] es,int[][] next,int count,IntStack stack){
		
		System.out.println(id);
		if(id==1&&isEmp(1,next[1],es)){
			es[1]=++count;
		}else{
			if(fs[id]==0) fs[id]=count;
			if(isEmp(id,next[id],es)){
				count++;
				es[id]=count;
				function(stack.pop(),fs,es,next,count,stack);
			}else{
				int piv=0;
				for(int i=0;i<next[id].length;i++){
					if(es[next[id][i]]==0){
						piv=i; 
						break;
					}
					
				}
				
				stack.push(id);
				count++;
				function(next[id][piv],fs,es,next,count,stack);
				
				
			}
		}
	}
	
	public static void print(int[] fs,int[] es){
		for(int i=1;i<fs.length;i++){
			System.out.printf("%d %d %d\n",i,fs[i],es[i]);
		}
	}
}
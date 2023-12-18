import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static int N;
	static char[][] s;
	static char[] S;
	static int[]  a;
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
//		calc();
		for(;;){
			N = sc.nextInt();
			if(N==0)break;
			init();
			already=new boolean[10];
			System.out.println(bt(0));
		}
	}
	static boolean[] already;
	static long bt(int step){
		if(step==a.length){
			return calc();
//			calc();
		}
		long re=0;
		for(int i=0;i<10;i++){
			if(!already[i]){
				already[i]=true;
				a[step]=i;
				re+=bt(step+1);
				a[step]=-1;
				already[i]=false;
			}
		}
		return re;
	}
	static int calc(){
//		int[][] a = new int[3][];
//		a[0]=new int[3];
//		a[1]=new int[2];
//		a[2]=new int[3];
//		a[0][0]=1;
//		a[0][1]=2;
//		a[0][2]=3;
//		a[1][0]=4;
//		a[1][1]=5;
//		a[2][0]=6;
//		a[2][1]=7;
//		a[2][2]=8;
		
		int[] b = new int[10];
		int sum=0;
		for(int i=1;i<=8;i++){
			for(int j=0;j<N-1;j++){
//			for(int j=0;j<3;j++){
				int idx=s[j].length-i;
//				int idx=a[j].length-i;
				if(idx<0)continue;
				sum+=a[s[j][idx]];
//				System.out.println(a[j][idx]);
//				sum+=a[j][idx]*Math.pow(10,i-1);
			}
//			System.out.println("  "+ sum);
		}
		int sum2=0;
		for(int i=0;i<S.length;i++){
			sum2+=a[S[S.length-1-i]]*Math.pow(10, i);
		}
		if(sum==sum2){
			return 1;
		}
		else{
			return 0;
		}
	}
	static void init(){
		s = new char[N-1][];
		Set<Integer>set=new HashSet<Integer>();
		for(int i=0;i<N-1;i++){
			s[i]=sc.next().toCharArray();
			for(int j=0;j<s[i].length;j++){
				s[i][j]=(char)(s[i][j]-'A');
				set.add((int)s[i][j]);
			}
		}
		S=sc.next().toCharArray();
		for(int j=0;j<S.length;j++){
			S[j]=(char)(S[j]-'A');
			set.add((int)S[j]);
		}
		Map<Integer, Character>map=new HashMap<Integer,Character>();
		char cnt=0;
		for(Integer i:set){
			map.put(i,cnt++);
//			System.out.println(i);
		}
		for(int i=0;i<N-1;i++){
			for(int j=0;j<s[i].length;j++){
				s[i][j]=map.get((int)s[i][j]);
			}
		}
		for(int i=0;i<S.length;i++){
			S[i]=map.get((int)S[i]);
		}
		for(int i=0;i<N-1;i++){
			for(int j=0;j<s[i].length;j++){
//				System.out.print((int)s[i][j]+" ");
			}
//			System.out.println();
		}
//		System.out.println();
		for(int i=0;i<S.length;i++){
//			System.out.print((int)S[i]+" ");
		}
//		System.out.println();
		a=new int[set.size()];
	}
}
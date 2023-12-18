

import java.util.Scanner;

public class Main {
	private static final int INF = Integer.MAX_VALUE;
	static int n = 1;
	static int[] D;
	static int[] M;
	static int[] arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		int op_num = sc.nextInt();
		String[] op = new String[op_num+1];
		for(int i= 0;i<op.length;i++)
			op[i] = sc.nextLine();
		//System.out.println(n);
		init(n);
		arr = new int[op_num];
		for(int i=1;i<=op_num;i++) {
			String[] Split= op[i].split(" ");
			int x,y,z;
			if(Integer.parseInt(Split[0]) == 0 ) {
				x = Integer.parseInt(Split[1]);
				y = Integer.parseInt(Split[2]);
				z = Integer.parseInt(Split[3]);
				//System.out.println("Update:"+x+" "+y+" "+z);
				update(x,y,z,i-1);
			}else {
				/*for(int i1=0;i1<D.length;i1++) {
					//System.out.println("D"+i1+": "+ D[i1]);
					System.out.println("M"+i1+": "+ M[i1]);
				}*/
				x = Integer.parseInt(Split[1]);
				//System.out.println("find:"+x);
				if (find(x)!=-1)
					System.out.println(find(x));
			}
		}
	}
	private static int find(int x) {
		// TODO Auto-generated method stub
		int k = x + n -1;
		int index = M[k];
		//System.out.println(M[k]);
		if(index == -1)
			return -1;
		else
			return arr[index];
	}
	private static void update(int from, int to, int z,int mark) {
		// TODO Auto-generated method stub
		for(int i=from;i<=to;i++)
		{
			//M[i] = mark;
			M_update(from,to,mark);
		}
		
		/*for(int i = from + n -1;i<= to+n-1;i++) {
			d_update(i,z);
		}*/
		
		arr[mark] = z;
		
		
	}
	private static void M_update(int from, int to, int mark) {
		// TODO Auto-generated method stub
		int temp1,temp2;
		int index1,index2;
		index1=(from+n-1);
		index2 = (to+n-1);
		temp1 = index1 % 2; //判断from是不是某个父节点的左孩子  0-是 1-不是
		temp2 = index2 % 2; //判断to是不是某个父节点的右孩子  0-不是 1-是
		if(temp1==1) {
			M[index1] = mark;
			M[(int)((index1-1)/2)] = mark;//更新父节点
			index1++;
			if(temp2 ==0){
					M[index2] = mark;
					index2--;
			}
			for(int i=index1;i<=index2;i++){
				M[i] = mark;
				M[(int)((index1-1)/2)] = mark;
			}
		}else {
			if(temp2 ==0){
				M[index2] = mark;
				index2--;
			}
			for(int i=index1;i<=index2;i++){
				M[i] = mark;
				M[(int)((index1-1)/2)] = mark;
			}	
		}
	}
	private static void d_update(int k, int a) {
	
		k =k+n-1;
		D[k] = a;
		while(k>0) {
			k = (k-1)/2;
			D[k] = Math.min(D[k*2+1],D[k*2+2]);
		}
	}
	
	public static void init(int N) {
		n = 1;
		while(n<N)
			n*=2;
		D = new int[n*2 - 1];
		M = new int[n*2 - 1];
		for(int i=0;i<2*n-1;i++)
		{
			D[i] = INF;
			M[i] = -1;
		}
	}
	
	

}


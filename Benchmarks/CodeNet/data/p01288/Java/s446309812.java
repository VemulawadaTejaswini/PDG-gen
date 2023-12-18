import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int nodenum = sc.nextInt();
			int qnum = sc.nextInt();
			if(nodenum == 0 && qnum == 0){
				break;
			}
			initData(nodenum);

			for(int i = 2; i <= nodenum; i++){
				setParent(i, sc.nextInt());
			}
			backup();
			sc.nextLine();

			int res = 0;
			for(int i = 0; i < qnum; i++){
				char[] d = sc.nextLine().toCharArray();
				int n = new Integer(d[2] - '0');

				switch(d[0]){
					case 'M':
						mark(n);
						break;
					case 'Q':
						res = res + gmRoot(n);
						restore();
						break;		
				}
			}
		System.out.println(res);
		}
	}

	static int gmRoot(int node){
		int res = -2;
		int p = getParent(node);

		if(p == 0){
			res = node;			
		}else{
			res = gmRoot(p);
			setParent(node, res);
		}

		return res;
	}
	
	static int[] backup;
	static int[] data;
	static void initData(int nodenum){
		data = new int[nodenum];
		data[0] = -1;
	}
	static void backup(){
		backup = data.clone();
	}
	static void restore(){
		data = backup.clone();
	}
	static int getParent(int node){
		return data[node - 1] + 1;
	}
	static void setParent(int node, int parent){
		data[node - 1] = parent - 1;
	}
	static void mark(int node){
		data[node - 1] = -1;
	}
}
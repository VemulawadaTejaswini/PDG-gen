import java.util.Arrays;
import java.util.Scanner;

public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().A();
	}
	
	void B(){
		while(sc.hasNext()){
			char[] R=sc.next().toCharArray();
			if(R[0]=='-')	break;
			char[] G=sc.next().toString().toCharArray(),dd=sc.next().toCharArray();
			char now=G[0];
			int gi=1,ri=0,di=0;
			StringBuilder d=new StringBuilder(),r=new StringBuilder();
			while(true){
				//System.out.println("N"+now);
				if(di<dd.length){
					if(now==dd[di]){
						d.append(now);
						di++;
						now=R[ri++];
					}else{
						r.append(now);
						if(gi+1>R.length)	break;
						now=G[gi++];
					}
				}else{
					if(G[gi-1]!=now)	r.append(now);
					break;
				}
			}
			while(gi<G.length)	r.append(G[gi++]);
			System.out.println("D:"+d);
			System.out.print("ANS=");
			System.out.println(r);
		}
	}
	void A(){
		while(true){
			int W = sc.nextInt(), Q = sc.nextInt();
			if(W == 0 && Q == 0){
				break;
			}
			int [] b = new int[W];
			Arrays.fill(b, -1);
			while(Q-- > 0){
				String  str = sc.next();
				int id = sc.nextInt();
				if(str.equals("s")){
					int x = sc.nextInt();
					boolean flg2 = true;
					for(int i=0; i <= W - x; i++){
						boolean flg = true;
						for(int j= i; j < i + x; j++){
							if(b[j] != -1){
								flg = false;
								break;
							}
						}
						if(flg){
							flg2 = false;
							System.out.println(i);
							for(int j = i; j < i + x; j++){
								b[j] = id;
							}
							break;
						}
					}
					if(flg2){
						System.out.println("impossible");
					}
				}
				else{
					for(int i=0; i < W; i++){
						if(b[i] == id){
							b[i] = -1;
						}
					}
				}
				//debug
//				System.out.print("DEB= ");
//				for(int i=0; i < b.length; i++){
//					System.out.print(b[i]);
//				}
//				System.out.println();
			}
			System.out.println("END");
		}
	}
}


import java.util.*;

public class Main {

	public static int fact(int n){
		return n<=1 ? 1 : n*fact(n-1);
	}

	//1~nまでのn枚のカードを並べるとき、カードの並びがxとなるのは何番目か（はじめを０番目として）
	public static int permulation(int n, int x){
		int[] p = new int[n];
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			p[i]=x%10;
			x/=10;
			list.add(i+1);
		}

		int sum=0;
		for(int i=n-1;i>=1;i--){
			sum+=list.indexOf((Integer)p[i])*fact(i);
			list.remove((Integer)p[i]);
		}

		return sum;
	}

	//x番目のカードの並びは何か
	public static int ipermulation(int n, int x){
		ArrayList<Integer> list = new ArrayList<Integer>();
		int sum=0;
		for(int i=0;i<n;i++)
			list.add(i+1);
		for(int i=n-1;i>=0;i--){
			int j=0;
			for(j=1;j<=n;j++){
				if(x<fact(i)*j)
					break;
			}
			sum+=list.get(j-1)*(int)Math.pow(10, i);
			list.remove(j-1);
			x-=fact(i)*(j-1);
		}

		return sum;
	}

	public static int ad(int n){
		int a = n;
		for(int i=0;i<8;i++){
			a+=(int)Math.pow(10, i);
			n/=10;
		}
		return a;
	}

	public static void change(int n, int[] ptn){
		int[] p = new int[8];
		int[] p_= new int[8];
		int pos=0;
		for(int i=0;i<8;i++){
			p_[i]=p[i]=n%10;
			n/=10;
			if(p[i]==1)
				pos = i;
		}

		switch (pos) {
		case 7:
			for(int i=0;i<8;i++)
				p_[i]=p[i];
			p_[6]=p[7];
			p_[7]=p[6];
			ptn[0]=p_[0]+p_[1]*10+p_[2]*100+p_[3]*1000+p_[4]*10000+p_[5]*100000+p_[6]*1000000+p_[7]*10000000;
			for(int i=0;i<8;i++)
				p_[i]=p[i];
			p_[7]=p[3];
			p_[3]=p[7];
			ptn[1]=p_[0]+p_[1]*10+p_[2]*100+p_[3]*1000+p_[4]*10000+p_[5]*100000+p_[6]*1000000+p_[7]*10000000;
			break;
		case 3:
			for(int i=0;i<8;i++)
				p_[i]=p[i];
			p_[3]=p[2];
			p_[2]=p[3];
			ptn[0]=p_[0]+p_[1]*10+p_[2]*100+p_[3]*1000+p_[4]*10000+p_[5]*100000+p_[6]*1000000+p_[7]*10000000;
			for(int i=0;i<8;i++)
				p_[i]=p[i];
			p_[7]=p[3];
			p_[3]=p[7];
			ptn[1]=p_[0]+p_[1]*10+p_[2]*100+p_[3]*1000+p_[4]*10000+p_[5]*100000+p_[6]*1000000+p_[7]*10000000;
			break;
		case 4:
			for(int i=0;i<8;i++)
				p_[i]=p[i];
			p_[4]=p[5];
			p_[5]=p[4];
			ptn[0]=p_[0]+p_[1]*10+p_[2]*100+p_[3]*1000+p_[4]*10000+p_[5]*100000+p_[6]*1000000+p_[7]*10000000;
			for(int i=0;i<8;i++)
				p_[i]=p[i];
			p_[4]=p[0];
			p_[0]=p[4];
			ptn[1]=p_[0]+p_[1]*10+p_[2]*100+p_[3]*1000+p_[4]*10000+p_[5]*100000+p_[6]*1000000+p_[7]*10000000;
			break;
		case 0:
			for(int i=0;i<8;i++)
				p_[i]=p[i];
			p_[0]=p[4];
			p_[4]=p[0];
			ptn[0]=p_[0]+p_[1]*10+p_[2]*100+p_[3]*1000+p_[4]*10000+p_[5]*100000+p_[6]*1000000+p_[7]*10000000;
			for(int i=0;i<8;i++)
				p_[i]=p[i];
			p_[0]=p[1];
			p_[1]=p[0];
			ptn[1]=p_[0]+p_[1]*10+p_[2]*100+p_[3]*1000+p_[4]*10000+p_[5]*100000+p_[6]*1000000+p_[7]*10000000;
			break;
		case 6:
			for(int i=0;i<8;i++)
				p_[i]=p[i];
			p_[7]=p[6];
			p_[6]=p[7];
			ptn[0]=p_[0]+p_[1]*10+p_[2]*100+p_[3]*1000+p_[4]*10000+p_[5]*100000+p_[6]*1000000+p_[7]*10000000;
			for(int i=0;i<8;i++)
				p_[i]=p[i];
			p_[6]=p[2];
			p_[2]=p[6];
			ptn[1]=p_[0]+p_[1]*10+p_[2]*100+p_[3]*1000+p_[4]*10000+p_[5]*100000+p_[6]*1000000+p_[7]*10000000;
			for(int i=0;i<8;i++)
				p_[i]=p[i];
			p_[6]=p[5];
			p_[5]=p[6];
			ptn[2]=p_[0]+p_[1]*10+p_[2]*100+p_[3]*1000+p_[4]*10000+p_[5]*100000+p_[6]*1000000+p_[7]*10000000;
			break;
		case 5:
			for(int i=0;i<8;i++)
				p_[i]=p[i];
			p_[5]=p[4];
			p_[4]=p[5];
			ptn[0]=p_[0]+p_[1]*10+p_[2]*100+p_[3]*1000+p_[4]*10000+p_[5]*100000+p_[6]*1000000+p_[7]*10000000;
			for(int i=0;i<8;i++)
				p_[i]=p[i];
			p_[5]=p[1];
			p_[1]=p[5];
			ptn[1]=p_[0]+p_[1]*10+p_[2]*100+p_[3]*1000+p_[4]*10000+p_[5]*100000+p_[6]*1000000+p_[7]*10000000;
			for(int i=0;i<8;i++)
				p_[i]=p[i];
			p_[6]=p[5];
			p_[5]=p[6];
			ptn[2]=p_[0]+p_[1]*10+p_[2]*100+p_[3]*1000+p_[4]*10000+p_[5]*100000+p_[6]*1000000+p_[7]*10000000;
			break;
		case 2:
			for(int i=0;i<8;i++)
				p_[i]=p[i];
			p_[3]=p[2];
			p_[2]=p[3];
			ptn[0]=p_[0]+p_[1]*10+p_[2]*100+p_[3]*1000+p_[4]*10000+p_[5]*100000+p_[6]*1000000+p_[7]*10000000;
			for(int i=0;i<8;i++)
				p_[i]=p[i];
			p_[6]=p[2];
			p_[2]=p[6];
			ptn[1]=p_[0]+p_[1]*10+p_[2]*100+p_[3]*1000+p_[4]*10000+p_[5]*100000+p_[6]*1000000+p_[7]*10000000;
			for(int i=0;i<8;i++)
				p_[i]=p[i];
			p_[1]=p[2];
			p_[2]=p[1];
			ptn[2]=p_[0]+p_[1]*10+p_[2]*100+p_[3]*1000+p_[4]*10000+p_[5]*100000+p_[6]*1000000+p_[7]*10000000;
			break;
		case 1:
			for(int i=0;i<8;i++)
				p_[i]=p[i];
			p_[1]=p[2];
			p_[2]=p[1];
			ptn[0]=p_[0]+p_[1]*10+p_[2]*100+p_[3]*1000+p_[4]*10000+p_[5]*100000+p_[6]*1000000+p_[7]*10000000;
			for(int i=0;i<8;i++)
				p_[i]=p[i];
			p_[1]=p[5];
			p_[5]=p[1];
			ptn[1]=p_[0]+p_[1]*10+p_[2]*100+p_[3]*1000+p_[4]*10000+p_[5]*100000+p_[6]*1000000+p_[7]*10000000;
			for(int i=0;i<8;i++)
				p_[i]=p[i];
			p_[1]=p[0];
			p_[0]=p[1];
			ptn[2]=p_[0]+p_[1]*10+p_[2]*100+p_[3]*1000+p_[4]*10000+p_[5]*100000+p_[6]*1000000+p_[7]*10000000;
			break;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String num = new String("");
		short[] point = new short[fact(8)];
		for(int i=1;i<fact(8);i++)
			point[i]=30000;

		LinkedList<Integer> que = new LinkedList<Integer>();


		que.offer(12345678);
		que.offer(0);
		while(que.size()>0){
			int n = que.poll();
			int cnt =que.poll();


			int[] ptn = {0,0,0};

			change(n,ptn);
			for(int i=0;i<3;i++){
				if(ptn[i]!=0 && point[permulation(8,ptn[i])]>cnt+1){
					point[permulation(8,ptn[i])]=(short)(cnt+1);
					que.offer(ptn[i]);
					que.offer(cnt+1);

					//System.out.println(point[permulation(8,ptn[i])]);
					//if(cnt+1>=10)
					//	System.exit(0);
				}
			}
		}


		while(scan.hasNext()){

			for(int i=0;i<8;i++){
				num+=scan.next();
			}


			System.out.println(point[permulation(8,ad(Integer.parseInt(num)))]);

			num="";
		}
	}
}
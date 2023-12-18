import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();

		while(d-- > 0){
			int n = sc.nextInt();
			int before = 0, beforeH = 50;
			ArrayList<Box> al = new ArrayList<Box>();

			for(int i=0;i<n;i++){
				int b = sc.nextInt();
				int h = sc.nextInt();
				al.add(new Box(before,b,beforeH,h,0,0));
				before = b;
				beforeH = h;
				if(i == n-1) al.add(new Box(before,100,beforeH,50,0,0));
			}

			int m = sc.nextInt();
			for(int i=0;i<m;i++){
				int f = sc.nextInt();
				int a = sc.nextInt();
				int pos = 0;
				for(;!(al.get(pos).lx<=f && f<=al.get(pos).rx);pos++);
				al.get(pos).addV(a);
			}

			int l = sc.nextInt();
			Set[] s = new Set[l];
			for(int i=0;i<l;i++){
				s[i] = new Set(i,sc.nextInt(),sc.nextInt());
			}
			Arrays.sort(s,new Comp1());

			int now = 0;
			for(int i=0;i<l;i++){
				for(;now<s[i].t;now++){
					if(al.size() == 1){
						Box b = al.get(0);
						b.nowH += b.vh;
						if(b.nowH > (double)b.h) b.nowH = (double)b.h;
						continue;
					}

					for(int j=0;j<al.size();j++){
						Box b = al.get(j);
						if(b.v > 0) b.nowH += b.vh;

						if(b.nowH > (double)b.h){
							for(int k=j;k>0 && al.get(k).lh < al.get(k).rh;k--){
								Box tmp = al.get(k);
								double diff = (tmp.nowH - (double)tmp.h) * (tmp.rx - tmp.lx);
								if(diff <= 0) break;
								al.get(k-1).nowH += diff / (double)(al.get(k-1).rx - al.get(k-1).lx);
								tmp.nowH = (double)tmp.h;
							}
							for(int k=j;k<al.size()-1 && al.get(k).lh > al.get(k).rh;k++){
								Box tmp = al.get(k);
								double diff = (tmp.nowH - (double)tmp.h) * (tmp.rx - tmp.lx);
								if(diff <= 0) break;
								al.get(k+1).nowH += diff / (double)(al.get(k+1).rx - al.get(k+1).lx);
								tmp.nowH = (double)tmp.h;
							}
						}
					}

					for(int j=0;j<al.size();j++){
						if(al.size() == 1) break;
						Box b = al.get(j);
						while(b.nowH > (double)b.h){
							boolean leftFlg = b.lh < b.rh ? true : false;
							if(leftFlg){
								b = al.get(j-1).addBox(b);
								al.remove(j-1);
								j--;
							}
							else{
								b = b.addBox(al.get(j+1));
								al.remove(j+1);
							}
							al.set(j,b);
						}
					}
				}
				//System.out.println(al);

				int pos = 0;
				for(;!(al.get(pos).lx<=s[i].p && s[i].p<=al.get(pos).rx);pos++);
				s[i].ans = al.get(pos).nowH;
			}

			Arrays.sort(s,new Comp2());
			for(int i=0;i<l;i++){
				System.out.println(s[i].ans);
			}
		}
	}
}

class Comp1 implements Comparator<Set>{
	public int compare(Set s1,Set s2){
		return s1.t - s2.t;
	}
}

class Comp2 implements Comparator<Set>{
	public int compare(Set s1,Set s2){
		return s1.set - s2.set;
	}
}

class Set{
	int set,p,t;
	double ans;

	Set(int set,int p,int t){
		this.set = set;
		this.p = p;
		this.t = t;
	}
}

class Box{
	int h,lx,rx,lh,rh,v;
	double vh,nowH;

	Box(){}

	Box(int lx,int rx,int lh,int rh,int v,double nowH){
		this.h = h;
		this.lx = lx;
		this.rx = rx;
		this.lh = lh;
		this.rh = rh;
		this.v = v;
		this.nowH = nowH;

		this.h = Math.min(lh,rh);
		this.vh = (double)v / ((double)(rx - lx) * 30);
	}

	void addV(int v){
		this.v += v;
		this.vh = (double)this.v / ((double)(rx - lx) * 30);
	}

	//thisÌE¤É b ðÇÁ
	Box addBox(Box b){
		Box res = new Box();

		res.h = Math.min(this.lh,b.rh);
		res.lx = this.lx;
		res.rx = b.rx;
		res.lh = this.lh;
		res.rh = b.rh;
		res.v = this.v + b.v;

		double diff1 = (this.nowH - (double)this.h) * (this.rx - this.lx);
		double diff2 = (b.nowH - (double)b.h) * (b.rx - b.lx);
		res.nowH = this.h + Math.max(diff1,diff2) / (double)(res.rx - res.lx);
		res.vh = (double)res.v / ((double)(res.rx - res.lx) * 30);

		return res;
	}

	public String toString(){
		return String.format("[(%.2f/%d)*(%d->%d)*30,%d-%d,%f]",nowH,h,lx,rx,lh,rh,vh);
	}
}
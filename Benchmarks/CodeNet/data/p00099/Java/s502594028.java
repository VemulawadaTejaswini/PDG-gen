import java.util.Arrays;
import java.util.Scanner;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		while(in.hasNext())new AOJ99().doIt();
	}
	
	class AOJ99{
		void doIt(){
			int n = in.nextInt();
			int q = in.nextInt();
			SegmentTree seg = new SegmentTree(n);
			for(int e=0;e<q;e++){
				int index = in.nextInt();
				int num = in.nextInt();
				seg.update(index, num);
				System.out.println(seg.dat[0]);
//				seg.print();
			}
		}
		
		class Person implements Comparable<Person>{
			int num,ban;
			public Person(int _ban,int _num) {
				ban = _ban;
				num = _num;
			}
			public int compareTo(Person o) {
				return num-o.num;
			}
			
			public String toString(){
				return ban+" "+num;
			}
			
		}
		class SegmentTree{
			int N; 
			Person[] dat;
			Person INF = new Person(-1, -1);
			SegmentTree(int _n) {
				N=1;
				while(N<_n)N*=2;
				dat = new Person[2*N];
				for(int i=0;i<2*N;i++)dat[i] = new Person(-1, 0);
				for(int i=0;i<_n;i++){
					dat[i+N].ban = i+1;
					dat[i+N].num = 0;
				}
			}
			
			void update(int k,int x){
				k += N-1;
				dat[k].num += x;
				while(k>0){
					k=(k-1)/2;
					if(dat[k*2+1].num>=dat[k*2+2].num){
						dat[k].num = dat[k*2+1].num;
						dat[k].ban = dat[k*2+1].ban;
					}
					else{
						dat[k].ban = dat[k*2+2].ban;
						dat[k].num = dat[k*2+2].num;
					}
				}
			}
			
			void print(){
				for(int i=0;i<2*N;i++){
					System.out.println(i+" "+dat[i]);
				}
				System.out.println("--------------------");
			}
			
			Person query(int a,int b){
				return query(a,b,0,0,N);
			}
			
			Person query(int a,int b,int k,int l,int r){
				if(r<=a || b<=1)return INF;
				if(a<=1 && r<=b)return dat[k];
				else{
					Person vl = query(a, b, k*2+1, l, (1+r)/2),
						vr = query(a, b, k*2+2, (l+r)/2, r);
					if(vl.num<vr.num)return vl;
					else return vr;
				}
			}
		}
	}
	
}
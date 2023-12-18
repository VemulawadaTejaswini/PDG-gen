import java.util.*;
class P{
    String name;int m,point;
    int[] d;
    public P(String name,int m,int[] d){
	this.name=name;this.m=m;this.d=d;
	point=0;
    }
}
class Main{
    boolean debug=true;
    Scanner sc=new Scanner(System.in);

    void run(){
	while(true){
	    int n=sc.nextInt();if(n==0)break;
	    int[] a=new int[31];
	    P[] list=new P[n];
	    for(int i=0;i<n;i++){
		String name=sc.next();
		int m=sc.nextInt();
		int[] d=new int[m];
		for(int j=0;j<m;j++){d[j]=sc.nextInt();a[d[j]]++;}
		list[i]=new P(name,m,d);
	    }

	    for(int i=0;i<n;i++){
		for(int j=0;j<list[i].m;j++){
		    list[i].point+=n+1-a[list[i].d[j]];
		}
	    }
	    Arrays.sort(list,new Comparator<P>(){
		    public int compare(P o1,P o2){
			if(o1.point!=o2.point)return o1.point-o2.point;
			return o1.name.compareTo(o2.name);
		    }
		});
	    System.out.printf("%d %s\n",list[0].point,list[0].name);
	}

    }
    public static void main(String[] args){
	new Main().run();
    }
}
import java.util.*;


class Page{
 
    String name;
    int n,btnn;
    int[][] b;
    String[] linkpage;
    public Page(int n,String name,int btnn,int[][] b,String[] linkpage){
	this.n=n;this.name=name;this.btnn=btnn;this.b=b;this.linkpage=linkpage;
    }
}



class Main{
   boolean debug=false;
    int n,w,h;
    HashMap<String,Integer> map;

    void run(){
	Scanner sc=new Scanner(System.in);
	while(true){
	    n=sc.nextInt();if(n==0)break;
	    w=sc.nextInt();h=sc.nextInt();
	    Page[] a=new Page[n];
	    map=new HashMap<String,Integer>();
	    for(int k=0;k<n;k++){
		String name=sc.next();
		int btnn=sc.nextInt();
		int[][] b=new int[btnn][4];
		String[] linkpage=new String[btnn];
		for(int i=0;i<btnn;i++){
		    b[i][0]=sc.nextInt();b[i][1]=sc.nextInt();
		    b[i][2]=sc.nextInt();b[i][3]=sc.nextInt();
		    linkpage[i]=sc.next();
		}
		a[k]=new Page(k,name,btnn,b,linkpage);
	    }
	    for(int i=0;i<n;i++){
		String name=a[i].name;
		map.put(name,i);//名前ーページ番号
	    }

	    int m=sc.nextInt();
	    LinkedList<Integer> rireki=new LinkedList<Integer>();
	    Page cnt=a[0];int pt=0;rireki.add(0);
	    for(int i=0;i<m;i++){
		char command=sc.next().charAt(0);
		switch(command){
			case 'c':{
		    int x=sc.nextInt();int y=sc.nextInt();
		    if(debug)System.out.printf("cnt.btnn=%d x=%d y=%d cnt.b[0][0]=%d \n",cnt.btnn,x,y,cnt.b[0][0]);
		    for(int k=0;k<cnt.btnn;k++){
			if(inrange(cnt.b[k],x,y)){
			    while(rireki.size()>pt+1)rireki.removeLast();
			    cnt=a[map.get(cnt.linkpage[k])];
			    rireki.add(cnt.n);if(debug)System.out.printf("pppp \n");
			    pt++;
			    break;
			}}
		    break;
		}
		case 'b':{if(pt>0)pt--;cnt=a[rireki.get(pt)];break;}
		case 'f':{if(pt<rireki.size()-1)pt++;cnt=a[rireki.get(pt)];break;}
		case 's':{System.out.println(cnt.name);
			if(debug)System.out.printf("size=%d cnt.n=%d cnt.name=%s pt=%d \n",rireki.size(),cnt.n,cnt.name,pt);break;}
		}
	    }
	}
    }

    boolean inrange(int[] b,int x,int y){
	return x>=b[0] && x<=b[2] && y<=b[3] && y>=b[1];
    }

    public static void main(String[] args){
	new Main().run();
    }}
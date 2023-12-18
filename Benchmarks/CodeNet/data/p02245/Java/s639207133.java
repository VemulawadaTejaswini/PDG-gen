import java.util.*;
public class Main{
    final static int LineN=3;
    final static int FullN=9;
    final static int[] dx={-1,0,1,0};
    final static int[] dy={0,-1,0,1};
    final static long Goalhash=1234567890;
    final static String[] dir={"u","l","d","r"};//up left down right
    static Queue<Puzzle> que= new ArrayDeque<Puzzle>();
    static Map<Long,Puzzle> mp= new LinkedHashMap<Long,Puzzle>(16,0.75f,true);
    public static void main(String[]args){
	int i;
	String path;
	Puzzle nyu= new Puzzle(FullN);
	Scanner sca = new Scanner(System.in);
	for(i=0;i<FullN;i++){
	    nyu.f[i]=sca.nextInt();
	    if(nyu.f[i]==0){
		nyu.f[i]=FullN;//0<->9
		nyu.space=i;
	    }
	}
	nyu.path="";
	path=play(nyu);
	System.out.println(path.length());
    }
    static long makemyhash(Puzzle p){
	int i;
	long ha=0;
	for(i=0;i<FullN;i++){
	    ha+=p.f[i];//making hash;
	    ha*=10;
	}
	if(p.f[0]==1&&p.kotei==false)p.kotei=true;//fixing 1 to f[0]
 	return ha;
    }
    
    static String play(Puzzle first){
	int sx,sy,i,hzi,tx,ty;
	long hzhash;
	Puzzle u,v;
	que.add(first);
	mp.put(makemyhash(first),first);
	while(!que.isEmpty()){
	    u=que.poll();
	    if(makemyhash(u)==Goalhash)return u.path;
	    sx=u.space/LineN;//5->1(calculate x index of 0)
	    sy=u.space%LineN;//5->2(calculate y index of 0)
	    for(i=0;i<4;i++){
		tx=sx+dx[i];//calculate movement x
		ty=sy+dy[i];
		if(tx<0||ty<0||tx>=LineN||ty>=LineN)continue;
	      	if(tx==0&&ty==0&&u.kotei==true)continue;
		v=myclone(u);
		hzi=v.f[v.space];
		v.f[v.space]=v.f[tx*LineN+ty];//changing
		v.f[tx*LineN+ty]=hzi;
		v.space=tx*LineN+ty;
		v.hash=hzhash=makemyhash(v);
		if(mp.containsKey(hzhash)==false){
		    mp.put(hzhash,v);
		    v.path+=dir[i];//add char
		    que.add(v);
	       	}else{
		}
	    }
	}
	return "impossible";
    }
    public static Puzzle myclone(Puzzle p){
	int i;
	Puzzle im=new Puzzle(FullN);
	for(i=0;i<FullN;i++){
	     im.f[i]=p.f[i];
	}
	im.space=p.space;
	im.path=p.path;
	im.kotei=p.kotei;
      	im.hash=p.hash;
	return im;
    }
}
class Puzzle{
     public int f[];
     public int space;
     public String path;
    public long hash;
    public boolean kotei=false;
    Puzzle(int n){
	f=new int[n];
    }
}

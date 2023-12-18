import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static int N,W,H;
	static Map<String,Page> map;
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(true){
			N=cin.nextInt();
			if(N==0)break;
			map=new HashMap<String,Page>();
			W=cin.nextInt();
			H=cin.nextInt();
			Page[] pages=new Page[N];
			for(int i=0;i<N;i++){
				String name=cin.next();
				int cnt=cin.nextInt();
				pages[i]=new Page(name,cnt);
				map.put(name, pages[i]);
				for(int j=0;j<cnt;j++){
					int x1=cin.nextInt();
					int y1=cin.nextInt();
					int x2=cin.nextInt();
					int y2=cin.nextInt();
					pages[i].linkSt[j]=cin.next();
					pages[i].pages[j][0]=x1;
					pages[i].pages[j][1]=y1;
					pages[i].pages[j][2]=x2;
					pages[i].pages[j][3]=y2;
				}
			}
			for(int i=0;i<N;i++){
				pages[i].a();
			}
			Buffer b=new Buffer(pages[0]);
			Buffer head=b;
			for(int cases=cin.nextInt();cases--!=0;){
				String s=cin.next();
//				outputBuff(head);
//				System.out.println("   "+b.now.name);
				if(s.equals("show")){
					System.out.println(b.now.name);
					continue;
				}
				if(s.equals("back")){
					if(b.prev==null)continue;
					b=b.prev;
					continue;
				}
				if(s.equals("forward")){
					if(b.next==null)continue;
					b=b.next;
					continue;
				}
				Page now=b.now;
				int next=now.clicked(cin.nextInt(), cin.nextInt());
				if(next==-1)continue;
				
				b.next=new Buffer(now.link[next]);
				b.next.prev=b;
				b=b.next;
				
			}
		}
		
	}
	static void outputBuff(Buffer b){
		if(b==null)return;
		System.out.println(b.now.name);
		outputBuff(b.next);
	}
	static class Buffer{
		Buffer next;
		Buffer prev;
		Page now;
		Buffer(Page p){
			now=p;
		}
	}
	static class Page{
		String name;
		int[][] pages;
		String[] linkSt;
		Page[] link;
		Page(String s,int cnt){
			name=s;
			pages=new int[cnt][4];
			link=new Page[cnt];
			linkSt=new String[cnt];
		}
		void a(){
			for(int i=0;i<link.length;i++){
				link[i]=map.get(linkSt[i]);
			}
		}
		int clicked(int x,int y){
			for(int i=0;i<link.length;i++){
				if(x<=pages[i][2]&&pages[i][0]<=x&&pages[i][1]<=y&&y<=pages[i][3]){
					return i;
				}
			}
			return -1;
		}
	}
}
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//Speed
public class Main{

	class C{
		int suit, rank;
		public C(String s) {
			suit = s.charAt(0);
			char c = s.charAt(1);
			rank = c=='A'?1:c=='K'?13:c=='Q'?12:c=='J'?11:c=='X'?10:(c-'0');
		}
		boolean isNeighbor(C c){
			int r1 = rank-1, r2 = c.rank-1;
			return (r1+1)%13==r2 || (r2+1)%13==r1;
		}
		boolean isStrong(C c){
			int r1 = rank, r2 = c.rank;
			if(r1==1)r1=14;
			if(r2==1)r2=14;
			return r1!=r2?r1>r2:suit>c.suit;
		}
		@Override
		public String toString() {
			return suit+" "+rank;
		}
	}
	
	final int WAIT = 0, THINK = 1, DECK = 2, PUT = 3, BACK = 4, WIN = 5;
	String[] E={"WAIT","THINK","DECK","PUT","BACK","WIN"};
	
	class R{
		int id;
		C lastCard, nowCard;
		int pos, to, t, event, num;
		Queue<C> deck;
		boolean leftSide;
		C[] place;
		public R(int id) {
			place = new C[4];
			this.id = id;
			lastCard = nowCard = null;
			deck = new LinkedList<C>();
		}
		void put(){
			num--;
//			System.out.println("Robot :"+id+" put to:"+to+" Card:"+nowCard);
			table[to] = nowCard;
			nowCard = null;
			lastCard = table[to];
			event = THINK;
			winCheck();
//			if(event==WIN)
//			System.out.println("E win");
			R r = robot[1-id];
			if(r.event==WAIT){
				r.event = THINK;
			}
		}
		void putPrepare(){
			int j = choice();
			nowCard = place[j];
			place[j] = null;
			pos = j;
			event = PUT;
			if(table[id].isNeighbor(nowCard)){
				to = id;
				t+=5;
				leftSide = false;
			}
			else{
				to = 1-id;
				t+=7;
				leftSide = true;
			}
		}
		void back(){
			event = THINK;
//			t+=5;
			place[pos] = nowCard;
			num++;
		}
		void init(){
			num = Math.min(4, deck.size());
			for(int i=0;i<num;i++)place[i]=deck.poll();
			event = WAIT;
		}
		void restart(){
//			System.out.println("Restart: "+id);
			t = 0;
			event = THINK;
			if(deck.isEmpty()){
				num--;
				for(int i=0;i<4;i++)if(place[i]!=null){
					table[id] = place[i];
					lastCard  = place[i];
					place[i] = null;
					break;
				}
				winCheck();
			}
			else{
				table[id] = deck.poll();
				lastCard = table[id];
			}
		}
		void winCheck(){
			if(num==0){
				event = WIN;
			}
		}
		void draw(){
			event = THINK;
			for(int i=0;i<4;i++)if(place[i]==null){
				num++;
				place[i] = deck.poll();
				break;
			}
		}
		int choice(){
			C c = null;
			int r = -1;
			for(int i=0;i<4;i++)if(place[i]!=null){
				if(place[i].isNeighbor(table[id])){
					if(c==null){
						c = place[i]; r = i;
					}
					else if(!place[i].isStrong(c)){
						c = place[i]; r = i;
					}
				}
			}
			if(r!=-1)return r;
			for(int i=0;i<4;i++)if(place[i]!=null){
				if(place[i].isNeighbor(table[1-id])){
					if(c==null){
						c = place[i]; r = i;
					}
					else if(!place[i].isStrong(c)){
						c = place[i]; r = i;
					}
				}
			}
			return r;
		}
		public String toString() {
			return "id: "+id+"\n"+"Event: "+E[event]+"\n"+"LastCard: "+lastCard+"\n"+"NowCard: "+nowCard+"\n"+"Num: "+num+"\n";
		}
	}
	
	R[] robot;
	C[] table;
	
	int which(){
		if(robot[0].event==WIN || robot[1].event==WIN){
			if(robot[0].event==WIN){
				if(robot[1].event!=WIN){
					if(robot[1].t < robot[0].t)return 1;
					else return 0;
				}
				return 0;
			}
			else {
				if(robot[0].event!=WIN){
					if(robot[0].t<robot[1].t)return 0;
					else return 1;
				}
				else return 1;
			}
		}
		if(robot[0].event==WAIT && robot[1].event==WAIT){
			int c0 = robot[0].choice(), c1 = robot[1].choice();
//			System.out.println("c0:"+c0+" c1:"+c1);
			if(c0==-1&&c1==-1)return -1;
			if(c0!=-1&&c1==-1)return 0;
			if(c0==-1&&c1!=-1)return 1;
			return robot[0].t<robot[1].t?0:1;
		}
		if(robot[0].event==WAIT)return 1;
		if(robot[1].event==WAIT)return 0;
		return robot[0].t<robot[1].t?0:1;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		robot = new R[2];
		table = new C[2];
		for(;;){
			int n = sc.nextInt();
			if(n==0)break;
			robot[0] = new R(0); robot[1] = new R(1);
			table[0] = table[1] = null;
			while(n--!=0)robot[0].deck.add(new C(sc.next()));
			n = sc.nextInt();
			while(n--!=0)robot[1].deck.add(new C(sc.next()));
			robot[0].init(); robot[1].init();
			robot[0].restart(); robot[1].restart();
			boolean winA = false;
//			int con = 0;
			for(;;){
				int i = which();
//				System.out.println("I:"+i);
				if(i==-1){
//					con = 0;
//					System.out.println(A+" RESTART");
					robot[0].restart(); robot[1].restart(); continue;
				}
				R r = robot[i];
//				con++;
//				System.out.println(r.id+" T:"+r.t+" event:"+E[r.event]);
				if(r.event==THINK){
//					System.out.println(A+" THINK");
					if(r.num==3 && !r.deck.isEmpty()){
//						r.event = DECK;
						r.t += 3;
						r.draw();
						continue;
					}
					int j = r.choice();
					if(j==-1){
						r.event = WAIT; continue;
					}
					r.putPrepare();
				}
				else if(r.event==DECK){
//					con = 0;
//					System.out.println(A+" DECK");
//					r.draw();
				}
				else if(r.event==PUT){
//					con = 0;
//					System.out.println(A+" PUT");
					
					if(robot[1-r.id].event==PUT){
						//put at same time
						if(r.t == robot[1-r.id].t){
							//put at same table
							if(r.leftSide!=robot[1-r.id].leftSide){
								//put by me
								if(r.leftSide){
									r.put();
									robot[1-r.id].t = r.t + 5;
									robot[1-r.id].back();
								}
								else{
									robot[1-r.id].put();
//									r.event = BACK;
									r.t = robot[1-r.id].t + 5;
									r.back();
								}
							}
							else r.put();
						}
						//put by me faster than other
						else{
							//put at same table
							if(r.leftSide!=robot[1-r.id].leftSide){
								r.put();
								robot[1-r.id].t = r.t+5;
								robot[1-r.id].back();
							}
							else r.put();
						}
					}
					else r.put();
				}
				else if(r.event==BACK){
//					con = 0;
//					System.out.println(A+" BACK");
//					r.back();
				}
				else if(r.event==WIN){
//					con = 0;
//					System.out.println(A+" WIN");
					R or = robot[1-r.id];
					if(or.event!=WIN){
						winA = r.id==0;
					}
					else{
						boolean me = r.lastCard.isStrong(or.lastCard);
						if(me)winA = r.id==0;
						else winA = or.id==0;
					}
					break;
				}
//				System.out.println(robot[0]);
//				System.out.println(robot[1]);
			}
			System.out.println(winA?"A wins.":"B wins.");
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}
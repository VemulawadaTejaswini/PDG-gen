import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		new AOJ0259().doIt();
	}
	
	class AOJ0259{
		String n;
		void solve(){
			int cnt = 0;
			while(n.equals("6174")==false){
				ArrayList<Integer> list = new ArrayList<Integer>();
				for(int i=0;i<4;i++)list.add(Integer.parseInt(n.charAt(i)+""));
				Collections.sort(list);
				String a="",b="";
				for(int i=3;i>=0;i--)a+=list.get(i);
				for(int i=0;i<4;i++)b+=list.get(i);
//				System.out.println(a+" "+b);
				n = Integer.toString((Integer.parseInt(a)-Integer.parseInt(b)));
//				System.out.println(n);
				cnt++;
				if(cnt==4)break;
			}
			System.out.println(cnt);
		}
		
		void doIt(){
			while(in.hasNext()){
				n = in.next();
				if(n.equals("0000"))break;
				int a = 0;
				for(int i=0;i<4;i++)if(n.charAt(i)==n.charAt(0))a++;
				if(a!=4)solve();
				else System.out.println("NA");
			}
		}
	}
	
}
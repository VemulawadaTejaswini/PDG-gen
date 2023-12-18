import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int m = scan.nextInt();
			if(n == 0 && m == 0){
				break;
			}
			String[] ch = new String[n];
			for(int i = 0;i < n;i++){
				ch[i] = "#";
			}
			for(int i = 0;i < m;i++){
				String t = scan.next();
				if(t.equals("A")){
					sitA(ch,t);
				}else if(t.equals("B")){
					sitB(ch,t);
				}else if(t.equals("C")){
					sitC(ch,t);
				}else if(t.equals("D")){
					if(i == 0){
						sitA(ch,t);
					}else{
						sitD(ch,t);
					}
				}
			}
			for(int i = 0;i < n;i++){
				System.out.print(ch[i] + ((i == n-1)?"\n":""));
			}
		}
	}
	
	public static void sitA(String[] ch,String t){
		for(int i = 0;i < ch.length;i++){
			if(ch[i].equals("#")){
				ch[i] = t;
				return;
			}
		}
	}
	
	public static void sitB(String[] ch,String t){
		for(int i = ch.length-1;i >= 0;i--){
			if(ch[i].equals("#")){
				if(i == 0){
					if(!ch[i+1].equals("A")){
						ch[i] = t;
						return;
					}
				}else if(i == ch.length-1){
					if(!ch[i-1].equals("A")){
						ch[i] = t;
						return;
					}
				}else{
					if(!ch[i+1].equals("A") && !ch[i-1].equals("A")){
						ch[i] = t;
						return;
					}
				}
			}
		}
		sitA(ch,t);
	}
	
	public static void sitC(String[] ch,String t){
		for(int i = 0;i < ch.length-1;i++){
			if(!ch[i].equals("#")){
				if(ch[i+1].equals("#")){
					ch[i+1] = t;
					return;
				}else if(i == 0){
				}else if(ch[i-1].equals("#")){
					ch[i-1] = t;
					return;
				}
			}
		}
		int n = ch.length;
		int nc = (n%2==0)?n/2:(n+1)/2-1;
		ch[nc] = t;
	}
	
	public static void sitD(String[] ch,String t){
		int tI = 0;
		int sCount = 0;
		int max = 0;
		boolean sw = true;
		int mtI = 0;
		for(int i = 0;i < ch.length;i++){
			if(ch[i].equals("#")){
				if(sw){
					tI = i;
					sCount++;
					sw = false;
				}else{
					sCount++;
				}
			}else{
				if(!sw){
					int a = (tI == 0)?sCount:(sCount % 2 == 0)?sCount/2:sCount/2+1;
					if(max == 0 || max < a){
						max = a;
						mtI = tI;
					}
					sw = true;
					sCount = 0;
				}
			}
		}
		if(!sw){
			int a = sCount;
			if(max == 0 || max < a){
				max = a;
				mtI = tI;
			}
		}
		ch[(mtI==0)?0:mtI+max-1] = t;
	}
}
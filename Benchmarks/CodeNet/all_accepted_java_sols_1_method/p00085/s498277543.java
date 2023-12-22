import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int leng = sc.nextInt();boolean[] p = new boolean[leng]; 
			int t = sc.nextInt(), pleng = p.length;
			if(pleng==0 & t==0) break;
			Arrays.fill(p, true);
			int tcount = pleng, count = 0;
			while(tcount!=1){
				for(int i = 0;i < t;){
					count++;
					count = count%pleng;
					if(p[count])i++;
				}       
				p[count] = false;
				tcount--;
			}
			int ans = 0;
			while(p[ans] == false ) ans++;
			if(ans==0) ans = pleng;
			System.out.println(ans);
		}
	}

}
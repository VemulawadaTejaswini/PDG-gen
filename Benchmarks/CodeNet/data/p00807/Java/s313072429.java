import java.util.Scanner;

//Beehives
public class Main{

	int get(int x, int y){
		return x*1000+y;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		int[][] move = {{1,1},{0,1},{-1,0},{-1,-1},{0,-1},{1,0}};
		int n = sc.nextInt(); sc.nextLine();
		while(n--!=0){
			char[] s = sc.nextLine().toCharArray();
			int t = s.length;
			int[] p = new int[t+1];
			int sx = 500, sy = 500;
			p[0] = get(sx, sy);
			for(int i=0;i<s.length;i++){
				sx += move[s[i]-'a'][0]; sy += move[s[i]-'a'][1];
				p[i+1] = get(sx, sy);
			}
			s = sc.nextLine().toCharArray();
			sc.nextLine();
			boolean res = false;
			for(int k=0;k<6;k++){
				int x = 500, y = 500;
				boolean[] u = new boolean[t+1];
				u[0] = true;
				boolean f = true;
				for(int i=0;i<s.length;i++){
					x+=move[(s[i]-'a'+k)%6][0];
					y+=move[(s[i]-'a'+k)%6][1];
					int pos = get(x, y);
					boolean exist = false;
					for(int j=0;j<t+1;j++){
						if(u[j]||p[j]!=pos)continue;
						exist = true;
						u[j] = true;
						break;
					}
					if(!exist)f = false;
				}
				for(int i=0;i<t+1;i++)if(!u[i])f = false;
				if(f)res = true;
			}
			System.out.println(res?"true":"false");
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}

import java.util.Scanner;
 
public class Main {
	static int turn(char[][] f,int herew,int hereh,int w,int h){
		int cnt  = 0;
		f[hereh][herew] = '#';
		if(hereh>0)
			if(f[hereh-1][herew]=='.')
				cnt += turn(f,herew,hereh-1,w,h);
		if(hereh<h-1)
			if(f[hereh+1][herew]=='.')
				cnt += turn(f,herew,hereh+1,w,h);
		if(herew>0)
			if(f[hereh][herew-1]=='.')
				cnt += turn(f,herew-1,hereh,w,h);
		if(herew<w-1)
			if(f[hereh][herew+1]=='.')
				cnt += turn(f,herew+1,hereh,w,h);
		return cnt+1;
	}
	
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        	while(sc.hasNext()) {
        		int w = sc.nextInt();
        		int h = sc.nextInt();
        		if(w+h==0)break;
        		char[][] f = new char[h+1][w+1];
        		int hereh = 0;
        		int herew = 0;
        		for(int i=0;i<h;i++) {
        			String str =sc.next();
        			for(int j=0;j<w;j++) {
        				f[i][j] = str.charAt(j);
        				if(f[i][j]=='@') {
        					hereh =i;
        					herew = j;
        					f[i][j]='#';
        				}
        			}
        		}
        		
        		System.out.println(turn(f,herew,hereh,w,h));
        	}
        }
    }
}




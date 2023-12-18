import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	char[] c;
	int p=0;
	void init(){
		int N=sc.nextInt();
		while(--N>=0){
			c=(sc.next()+"#").toCharArray();
			p=0;
			int ans=dfs();
			System.out.println(ans);
		}
	}
	
	int dfs(){
//		System.out.println(p+" "+c[p]);
		if(c[p]=='['){
			int ret=0;
			++p;
			if(c[p]=='['){
				ArrayList<Integer> tmp=new ArrayList<Integer>();
				while(c[p]=='['){
					tmp.add(dfs());
//					++p;
//					System.out.println(tmp+" "+p+" "+c[p]);
				}
				Collections.sort(tmp);
				for(int i=0; i<(tmp.size()/2)+1; ++i)	ret+=tmp.get(i);
				++p;
				return ret;
			}else if(Character.isDigit(c[p])){
				ArrayList<Integer> tmp = new ArrayList<Integer>();
				while(Character.isDigit(c[p])){
					int n=c[p]-'0';
					++p;
					while(Character.isDigit(c[p])){
						n=n*10+(c[p]-'0');
						++p;
					}
					tmp.add(n);
//					System.out.println("NUMBER "+n);
					++p;
					if(c[p]=='[')	++p;
				}
				Collections.sort(tmp);
//				System.out.println(tmp);
				for(int i=0; i<(tmp.size()/2)+1; ++i)	ret+=tmp.get(i)/2+1;
				return ret;
			}
		}
		return 0;
	}

}
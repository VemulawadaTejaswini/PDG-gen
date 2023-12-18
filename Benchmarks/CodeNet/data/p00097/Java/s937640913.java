import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tes = null;
		kan ka = new kan();

		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		try {
			tes = br.readLine();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		int a,b;
		int[] r = {0,0};
		String[] fruit = tes.split(" ", 0);
		a = Integer.parseInt(fruit[0]);
		al.add(a);
		b = Integer.parseInt(fruit[1]);
		al2.add(b);
		if(a == 0 && b == 0){
			return;
		}
		System.out.println(ka.test(a-1,b,r,0,0)[0]);
		while(true){
			try {
				tes = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			if(tes == null){
				break;
			}
			
			try{
				fruit = tes.split(" ", 0);
				a = Integer.parseInt(fruit[0]);
				al.add(a);
				b = Integer.parseInt(fruit[1]);
				al2.add(b);
				if(a == 0 && b == 0){
					return;
				}
				
			}catch(NumberFormatException e){
				break;
			}
			r[0] = 0;
			int[] ttt = ka.test(a-1,b,r,0,0);
			System.out.println(ttt[0]);
			/*int ttt = 0;
			int mtp = 0;
			int cc = a;
			int dd,ee,ff,gg,hh,ii,jj,kk;
			for(int c=0;c<10;c++){
				mtp = c;
				cc = a -1;
				for(int d=c+1;d<10;d++){
					dd = cc -1;
					if(c == d){
						continue;
					}
					if(dd == 0){
						if(mtp+d == a){
							ttt++;
						}
					}
					
					mtp +=d;
					for(int e=d+1;e<10;e++){
						ee = dd -1;
						if(c == e || d == e){
							continue;
						}
						if(ee == 0){
							if(mtp+e == a){
								ttt++;
							}
						}
						
						mtp +=e;
						
						for(int f=e+1;f<10;f++){
							
							ff = ee -1;
							if(c == f || d == f || e == f){
								continue;
							}
							if(ff == 0){
								if(mtp+f == a){
									ttt++;
								}
							}
							
							mtp +=f;
							
							
							for(int g=0;g<10;g++){
								
								
								gg = ff -1;
								if(c == g || d == g || e == g || f == g){
									continue;
								}
								if(gg == 0){
									if(mtp+g == a){
										ttt++;
									}
								}
								
								mtp +=f;
								
								
								for(int h=0;h<10;h++){
									for(int i=0;i<10;i++){
										for(int j=0;j<10;j++){
											for(int k=0;k<10;k++){
												
											}
										}
									}
								}
							}
						}
					}
					
				}
			}
		}

		System.out.println(al.get(0) - al.get(al.size() - 1));
		*/
		}
	}

}
/*class kan{
	public int test(int a,int b,int to,int co, ArrayList<Integer> al3, int k){
		int ct = 0;
		if(a == 0){
			int cot = 0;
			for(int i=k;i<=9;i++){
				ct = 0;
				for(int j=0;j<al3.size();j++){
					if(j == al3.get(j)){
						ct = 1;
					}
				}
				if(ct == 1){
					continue;
				}
				cot = co+i;
				if(cot == b){
					to++;
				}
				
			}
			return to;
		}
		
		for(int i=k;i<=9;i++){
			ct = 0;
			for(int j=0;j<al3.size();j++){
				if(j == al3.get(j)){
					ct = 1;
				}
			}
			if(ct == 1){
				continue;
			}
			al3.add(i);
			co += i;
			to += test(a-1,b,to,co, al3,i+1);
			co = 0;
			al3.remove(al3.size() -1);
		}
		
		
		return to;
	}
	
}*/

class kan{
public int[] test(int a,int b,int[] to,int co, int k){
	int ct = co;
	if(a == 0){
		int cot = 0;
		for(int i=k;i<=100;i++){
			cot = co+i;
			if(cot == b){
				to[0]++;
			}
			
		}
		return to;
	}
	
	for(int i=k;i<=100;i++){
		ct += i;
		test(a-1,b,to,co+i,i+1);
		ct = co;
	}
	
	
	return to;
}

}
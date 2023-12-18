import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		while (sc.hasNext()) {
			String str=sc.next();
			int[] counts=new int[14];
			Arrays.fill(counts,0);
			for(int i=0;i<str.length();i++){
				counts[str.charAt(i)-'0']++;
			}
			ArrayList<Integer> res=new ArrayList<Integer>();
			for(int i=1;i<=9;i++){
				counts[i]++;
				if(counts[i]<=4){
				if(can(counts)){
					res.add(i);
				}
				}
				counts[i]--;
			}
			if(res.size()>0){
			ln(join(res," "));
			}else{
				ln("0");
			}
		}
	}
	public boolean check(int[] list,int rest){
		if(rest==0){
			return true;
		}
		for(int i=1;i<=9;i++){
			if(list[i]>=3){
				list[i]-=3;
				if(check(list,rest-3)){
					list[i]+=3;
					return true;
				}
				list[i]+=3;
			}
			if(i<=7 && list[i]>=1 && list[i+1]>=1 && list[i+2]>=1){
				list[i]-=1;list[i+1]-=1;list[i+2]-=1;
				if(check(list,rest-3)){
					list[i]+=1;list[i+1]+=1;list[i+2]+=1;
					return true;
				}
				list[i]+=1;list[i+1]+=1;list[i+2]+=1;
			}
		}
		return false;
	}
	public boolean can(int[] list){
		for(int i=1;i<=9;i++){
			if(list[i]>=2){
				list[i]-=2;
				if(check(list,12)){
					list[i]+=2;
					return true;
				}
				list[i]+=2;
			}
		}
		return false;
	}

	public static String join(Collection<?> array, String separator) {
		Iterator<?> it=array.iterator();
		StringBuilder str = new StringBuilder(it.next() + "");
		while(it.hasNext()) {
			str.append(separator).append(it.next() + "");
		}
		return str.toString();
	}
	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}

import java.util.*;
public class Main {
	String [] page;
	int n;
	//0830 start
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			n = sc.nextInt();
			int m = sc.nextInt();
			if((n|m) == 0) break;
			page = new String[n];
			for(int i = 0 ; i < n; i++){
				page[i] = sc.next();
			}
			for(int i = 0; i < m; i++){
				String arg1 = sc.next();
				String arg2 = sc.next();
				String newa = fix(arg1);
				String newb = fix(arg2);
//				//debug
//				System.out.println("newa = " + newa);
//				System.out.println("newb = " + newb);
				
				if(newa == null || newb == null){
					System.out.println("not found");
				}
				else{
					String newaa = fix2(newa);
					String newbb = fix2(newb);
					boolean cand1 = (find(newa) || find(newaa));
					boolean cand2 = (find(newb) || find(newbb));
					if(cand1 && cand2){
						if(newa.equals(newb) || newa.equals(newbb) || newaa.equals(newb) || newaa.equals(newbb)){
							System.out.println("yes");
						}
						else{
							System.out.println("no");
						}
					}
					else{
						System.out.println("not found");
					}
				}
			}
		}
	}

	private String fix2(String newb) {
		if(newb.endsWith("/")){
			return newb + "index.html";
		}
		return newb + "/index.html";
	}

	private String fix(String arg) {
		
		String [] a = arg.split("/");
		ArrayList<String> work = new ArrayList<String>();
		for(int i = 0; i < a.length; i++){
			work.add(a[i]);
		}
		//debug
//		System.out.println(Arrays.toString(a));
//		System.out.println("a = " + work.toString());
		
		for(int i = 1; i < work.size(); i++){
			if(work.get(i).equals(".")){
				work.remove(i);
				i--;
			}
		}
		//debug
		//System.out.println(work.toString());
		
		for(int i = 1; i < work.size(); i++){
			if(work.get(i).equals("..")){
				StringBuilder sb = new StringBuilder("/");
				for(int j = 1; j < i; j++){
					sb.append(work.get(j) + "/");
				}
				boolean flg = false;
				for(int j = 0; j < n; j++){
//					//debug
//					System.out.println("test = " + page[j] + " " + sb.toString());
//					System.out.println("test2 = " + page[j].matches(sb.toString() + ".*"));
					if(page[j].matches(sb.toString() + ".*")){
						flg = true;
						break;
					}
				}
				if(! flg){
					return null;
				}
				work.remove(i);
				work.remove(i-1);
				i--;i--;
			}
		}
		StringBuilder res = new StringBuilder();
		for(int i = 0 ; i < work.size(); i++){
			res.append("/" + work.get(i));
		};
		//System.out.println(res.toString());
		if(arg.endsWith("/")){
			res.append("/");
		}
		if(res.length() > 0){
			return res.substring(1);
		}
		return res.toString();
	}

	private boolean find(String s) {
		for(int i = 0; i < n; i++){
			if(s.equals(page[i])) return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}
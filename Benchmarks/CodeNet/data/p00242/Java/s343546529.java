import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = Integer.valueOf(sc.nextLine());
			if(n==0) break;
			String[] s = new String[n];
			for(int i=0;i<n;i++) s[i] = sc.nextLine();
			char p = sc.nextLine().charAt(0);
			
			ArrayList<String> list = new ArrayList<String>();
			
			int[] num = new int[1000000];
			for(int i=0;i<n;i++){
				String[] t = s[i].split(" ");
				for(int j=0;j<t.length;j++){
					if(t[j].charAt(0)==p){
						if(list.contains(t[j])==true){
							num[list.indexOf(t[j])]++;
						}else{
							num[list.size()]++;
							list.add(t[j]);
						}
					}
				}
			}
			
			if(num[0]==0){
				System.out.println("NA");
			}else{
				ArrayList<String> ans = new ArrayList<String>();
				ArrayList<Integer> nlist = new ArrayList<Integer>();
				
				for(int i=0;i<list.size();i++){
					if(nlist.contains(num[i])==false) nlist.add(num[i]);
				}
				Collections.sort(nlist);
			
				int count = 0;
				for(int i=nlist.size()-1;i>=0;i--){
					for(int j=0;j<list.size();j++){
						if(num[j]==nlist.get(i)) ans.add(list.get(j));
					}
					Collections.sort(ans);
					for(int j=0;j<ans.size();j++){
						if(count!=0) System.out.print(" ");
						System.out.print(ans.get(j));
						count++;
						if(count==5) break;
					}
					if(count==5) break;
					ans.clear();
				}
				System.out.println();
			}
			
		}
	}
}
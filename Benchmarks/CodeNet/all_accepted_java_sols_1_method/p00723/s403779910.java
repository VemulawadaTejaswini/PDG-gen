import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int m = sc.nextInt();
			for(int i=0;i<m;i++){
				StringBuffer s = new StringBuffer(sc.next());
				StringBuffer t, u, v;
				ArrayList<String> list = new ArrayList<String>();
				list.add(s.toString());
				for(int j=1;j<s.length();j++){
					t = new StringBuffer(s.substring(0,j));
					u = new StringBuffer(s.substring(j,s.length()));
					v = new StringBuffer();
					
					v.delete(0, s.length());
					v.append(t);
					v.append(u.reverse());
					if(list.indexOf(v.toString())==-1){
						list.add(v.toString());
					}
					
					v.delete(0, s.length());
					v.append(t.reverse());
					v.append(u);
					if(list.indexOf(v.toString())==-1){
						list.add(v.toString());
					}
					
					v.delete(0, s.length());
					v.append(t);
					v.append(u.reverse());
					if(list.indexOf(v.toString())==-1){
						list.add(v.toString());
					}
					
					v.delete(0, s.length());
					v.append(u);
					v.append(t.reverse());
					if(list.indexOf(v.toString())==-1){
						list.add(v.toString());
					}
					
					v.delete(0, s.length());
					v.append(u.reverse());
					v.append(t);
					if(list.indexOf(v.toString())==-1){
						list.add(v.toString());
					}
					
					v.delete(0, s.length());
					v.append(u);
					v.append(t.reverse());
					if(list.indexOf(v.toString())==-1){
						list.add(v.toString());
					}
					
					v.delete(0, s.length());
					v.append(u.reverse());
					v.append(t);
					if(list.indexOf(v.toString())==-1){
						list.add(v.toString());
					}
				}	
				System.out.println(list.size());
			}
			
		}
	
	}	
}
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = "";
		int a, i;
		int[] num = new int[1001];
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> next = new ArrayList<Integer>();
		
		while(true){
			s = sc.nextLine();
			if(s.compareTo("")==0) break;
			
			i=0;
			while(s.substring(i,i+1).compareTo(",")!=0)i++;
			a = Integer.valueOf(s.substring(0,i));
			if(list.indexOf(a)==-1){
				num[list.size()]++;
				list.add(a);
			}else{
				num[list.indexOf(a)]++;
			}	
		}
		
		while(sc.hasNext()){
			s = sc.next();
			
			i=0;
			while(s.substring(i,i+1).compareTo(",")!=0)i++;
			a = Integer.valueOf(s.substring(0,i));
			
			if(list.indexOf(a)!=-1){
				num[list.indexOf(a)]++;
				if(next.indexOf(a)==-1) next.add(a);
			}
		}
		Collections.sort(next);
		for(int j=0;j<next.size();j++){
			a = next.get(j);
			System.out.println(a + " " + num[list.indexOf(a)]);
		}
	
	}
}
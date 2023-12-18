import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int h = sc.nextInt();
			if(n==0 && h==0) break;
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			String s;
			int a, b, c;
			
			for(int i=0;i<h;i++){
				s = sc.next();
				a = sc.nextInt()-1;
				b = sc.nextInt()-1;
				if(s.charAt(1)=='y'){
					c = b*1000+a;
					for(int z=0;z<n;z++){
						c+=z*1000000;
						if(list.contains(c)==false) list.add(c);
					}
				}else if(s.charAt(0)=='y'){
					c = b*1000000+a*1000;
					for(int x=0;x<n;x++){
						c+=x;
						if(list.contains(c)==false) list.add(c);
					}
				}else{
					c = b*1000000+a;
					for(int y=0;y<n;y++){
						c+=y*1000;
						if(list.contains(c)==false) list.add(c);
					}
				}
			}
			System.out.println(n*n*n-list.size());
		}	
	}	
}
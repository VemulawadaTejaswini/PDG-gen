import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int h = sc.nextInt();
			if(n==0 && h==0) break;
			
			HashSet<Integer> set = new HashSet<Integer>();
			String s;
			int a, b, c;
			
			for(int i=0;i<h;i++){
				s = sc.next();
				a = sc.nextInt();
				b = sc.nextInt();
				if(s.charAt(1)=='y'){
					c = b*501+a;
					for(int z=1;z<=n;z++){
						c+=z*501*501;
						set.add(c);
					}
				}else if(s.charAt(0)=='y'){
					c = b*501*501+a*501;
					for(int x=1;x<=n;x++){
						c+=x;
						set.add(c);
					}
				}else{
					c = b*501*501+a;
					for(int y=1;y<=n;y++){
						c+=y*501;
						set.add(c);
					}
				}
			}
			System.out.println(n*n*n-set.size());
		}	
	}	
}
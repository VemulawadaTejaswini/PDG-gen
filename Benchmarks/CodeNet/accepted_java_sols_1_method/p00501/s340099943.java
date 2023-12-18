import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String name = sc.next();
		int namenumber=name.length();
		int count = 0;
		int flag;
		for(int i=0;i<n;i++){
			String kanban = sc.next();
			int kanbannumber=kanban.length();
			for(int p=0;p<kanbannumber;p++){
				for(int q=1;;q++){
					if(p+q*(namenumber-1)>=kanbannumber){
						break;
					}
					flag = 1;
					for(int r=0;r<namenumber;r++){
						if(name.charAt(r)!=kanban.charAt(p+q*r)){
							flag = 0;
							break;
						}
					}
		  			if(flag==1){
					    count++;
					    p = kanbannumber;
					    break;
					}
				}
			}
		}
		System.out.println(count);
	}	
}
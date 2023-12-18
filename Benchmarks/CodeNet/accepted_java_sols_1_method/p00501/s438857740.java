import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			char[] s = sc.next().toCharArray();
			int count = 0;
			boolean flag;
			for(int i=0;i<n;i++){
				char[] t = sc.next().toCharArray();
				
				for(int p=0;p<t.length;p++){
					for(int q=1;;q++){
						if(p+q*(s.length-1)>=t.length) break;
						flag = true;
						for(int r=0;r<s.length;r++){
							if(s[r]!=t[p+q*r]){
								flag = false;
								break;
							}
						}
						if(flag==true){
							count++;
							p = t.length;
							break;
						}
					}
				}		
			}
			System.out.println(count);	
		}
	}	
}
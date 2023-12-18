import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			char[] s = sc.next().toCharArray();
			int[] a = new int[10];
			for(int i=0;i<13;i++) a[(int)s[i]-48]++;
			
			ArrayList<Integer> ans = new ArrayList<Integer>();
			int[] b = new int[10];
			
			for(int i=1;i<=9;i++){
				for(int j=1;j<=9;j++){
					if(a[i]<4){
						b = a.clone();
						b[i]++;
						b[j]-=2;
						for(int k=1;k<=7;k++){
							if(b[k]<0){
								b[9]=-1;
								break;
							}
							if(b[k]==1 || b[k]==4){
								b[k]--;
								b[k+1]--;
								b[k+2]--;
							}else if(b[k]==2){
								b[k]-=2;
								b[k+1]-=2;
								b[k+2]-=2;
							}
						}
						if(b[8]>=0 && b[8]%3==0 && b[9]>=0 && b[9]%3==0){
							ans.add(i);
							break;
						}
					}
				}
			}
			
			if(ans.size()==0) System.out.println(0);			
			else{
				for(int i=0;i<ans.size();i++){
					if(i!=0) System.out.print(" ");
					System.out.print(ans.get(i));
				}
				System.out.println();
			}
		}
	}
}
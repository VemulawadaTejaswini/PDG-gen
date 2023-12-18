import java.util.*;

public class Main {	
	public static void main(String[] args) {
		ArrayList<Integer> L = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=0;i<N;i++)
			L.add(sc.nextInt());
		sc.close();
		Collections.sort(L);
		int count=0;
		for(int i=0;i<N-2;i++) {
			for(int j=i+1;j<N-1;j++) {
				for(int k=j+1;k<N;k++) {
					if(judgeTriangle(L.get(i),L.get(j),L.get(k))==true)
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
	static public boolean judgeTriangle(int a,int b,int c){
		if(a<b&&b<c&&(a+b>c)) {
			return true;
		}
		else
			return false;
	}
}

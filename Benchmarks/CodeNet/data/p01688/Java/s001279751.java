import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int d = sc.nextInt();
		
		int x = sc.nextInt();
		ArrayList<Integer> oneD = new ArrayList<Integer>();
		for(int i=0;i<x;i++){
			String s = sc.next();
			int m = sc.nextInt();
			if(s.equals("D")) oneD.add(m);
		}
		Collections.sort(oneD);
		
		int y = sc.nextInt();
		ArrayList<Integer> twoD = new ArrayList<Integer>();
		for(int i=0;i<y;i++){
			String s = sc.next();
			int m = sc.nextInt();
			if(s.equals("DD")) twoD.add(m);
		}
		Collections.sort(twoD);

		int sum = 0;
		
		while(true){
			if(d==0 || oneD.size()==0 && twoD.size()==0) break;
			int d11 = 0;
			int d12 = 0;
			int d2 = 0;
			if(d==1){
				if(oneD.size()>0) d11 = oneD.get(oneD.size()-1);
				sum += d11;
				break;
			}else{
				if(oneD.size()>0) d11 = oneD.get(oneD.size()-1);
				if(oneD.size()>1) d12 = oneD.get(oneD.size()-2);
				if(twoD.size()>0) d2 = twoD.get(twoD.size()-1);
				if(d11+d12<=d2){
					sum += d2;
					twoD.remove(twoD.size()-1);
					d-=2;
				}else{
					sum += d11;
					oneD.remove(oneD.size()-1);
					d--;
				}
			}
		}
		
		System.out.println(sum);

	}	
}
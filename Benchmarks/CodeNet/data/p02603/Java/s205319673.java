import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		int N = scan.nextInt();
		ArrayList<Integer> num = new ArrayList<Integer>();
		long money =1000;
		num.add(scan.nextInt());
		for(int i=0;i<N-1;i++){
			int p = scan.nextInt();
			if(num.get(num.size()-1)!=p){
				num.add(p);
			}
		}

		for(int i=0;i<num.size();i++){
			int p = -1;
			int min = num.get(i);
			for(int l=i+1;l<num.size();l++){
				if(min<num.get(l)){
					p=l;
					break;
				}else if(min>num.get(l)){
					min=num.get(l);
				}
			}
			if(p!=-1){
				money+=(num.get(p)-min)*(money/min);
			}else{
				break;
			}
			i=p-1;
		}
		System.out.println(money);
	}
}

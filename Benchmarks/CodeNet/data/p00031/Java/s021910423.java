import java.util.*;
public class Main {
	static int Sum(List<Integer> a){
		int result=0;
		for(int i=0;i<a.size();i++)result+=a.get(i);
		return result;
	}
	static void print(List<Integer> a){
		Collections.sort(a);
		for(int i=0;i<a.size()-1;i++){
			System.out.print(a.get(i)+" ");
		}
		System.out.print(a.get(a.size()-1));
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int target = in.nextInt();
			List<Integer> result = new ArrayList<Integer>();
			int n=0;
			int sum=Sum(result);
			for(int i=10;i>=0;i--){
				if(sum+(1<<i)<=target){
					result.add(1<<i);
					sum=Sum(result);
				}
			}
			print(result);
		}
	}
}
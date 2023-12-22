import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayDeque<Integer> ans = new ArrayDeque<Integer>();

		while(sc.hasNext()){
			int count=0;
			int n = sc.nextInt();
			if(n<37){
				for(int a=0;a<10;a++){
					for(int b=0;b<10;b++){
						for(int c=0;c<10;c++){
							int t = n-(a+b+c);
							if(t>=0 && t<10)count++;
						}
					}
				}
			}
			ans.push(count);
		}
		int num = ans.size();
		for(int i=0;i<num;i++){
			System.out.println(ans.pollLast());
		}
	}
}

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int tm=scan.nextInt();
		String stmp=scan.nextLine();
		Queue<Integer> q=new LinkedList<>();
		Queue<String> qstr=new LinkedList<>();
		
		for(int i=0;i<n;i++){
			String string=scan.nextLine();
			String[] str=string.split(" ");
			qstr.offer(str[0]);
			q.offer(Integer.parseInt(str[1]));
		}
		int round=0;
		int sum=0;
		while(!q.isEmpty()){
			int tmp=q.poll();
			if(tmp<=tm){
				sum+=tmp;
				System.out.print(qstr.poll()+" ");
				//System.out.println(round*tm+tmp%tm-com);
				System.out.println(sum);
			}
			else {
				q.offer(tmp-tm);
				qstr.offer(qstr.poll());
				sum+=tm;
			}
			round++;
		}
	}

}


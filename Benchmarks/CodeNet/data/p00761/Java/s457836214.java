import java.util.*;

public class Main {

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int a = sc.nextInt();
			int digit = sc.nextInt();
			if((a|digit) == 0) break;
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(a);
			int ansi = -1,ansj = -1;
			for(int k=1; k < 22; k++){
				String astr = "" + a;
				StringBuilder sb =new StringBuilder();
				int len = astr.length();
				for(int i = len; i < digit; i++){
					sb.append("0");
				}
				sb.append(astr);
				//System.out.println("astr= " + astr + "a = " + a);
				char [] small = sb.toString().toCharArray();
				Arrays.sort(small);
				String smallstr = new String(small);
				StringBuilder work = new StringBuilder(smallstr);
				work.reverse();
				char [] big = work.toString().toCharArray();
				String bigstr = new String(big);

				//System.out.println("str= " + bigstr + " " + smallstr);
				int bigint = Integer.parseInt(bigstr);
				int smallint = Integer.parseInt(smallstr);
				a = bigint - smallint;
				if(list.contains(a)){
					ansi = k;
					break;
				}
				list.add(a);
			}
			//find a ansj
			for(int i=0; i < list.size();i++){
				if(list.get(i) == a){
					ansj = i;
					break;
				}
			}
			//debug
//			for(int i=0; i < list.size();i++){
//				System.out.print(list.get(i) + " ");
//			}
			System.out.println(ansj + " " + a +  " " + (ansi - ansj));
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}

}
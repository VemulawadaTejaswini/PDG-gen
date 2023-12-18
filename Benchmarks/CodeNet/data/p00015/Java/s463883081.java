import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String num1,num2;
		int N = Integer.parseInt(str);

		String[] tmp1,tmp2;
		List<Integer> list_a = new ArrayList<Integer>();
		List<Integer> list_b = new ArrayList<Integer>();
		List<Integer> ans = new ArrayList<Integer>();

		while(N-->0){
			//???????????????
			num1=br.readLine();
			tmp1=num1.split("");
			num2=br.readLine();
			tmp2=num2.split("");
			list_a.clear();
			list_b.clear();
			ans.clear();
			if(tmp1.length>=tmp2.length){
				for(int i=0;i<tmp1.length;i++){
					list_a.add(Integer.parseInt(tmp1[tmp1.length-i-1]));
				}
				for(int i=0;i<tmp2.length;i++){
					list_b.add(Integer.parseInt(tmp2[tmp2.length-i-1]));
				}
			}else{
				for(int i=0;i<tmp2.length;i++){
					list_a.add(Integer.parseInt(tmp2[tmp2.length-i-1]));
				}
				for(int i=0;i<tmp1.length;i++){
					list_b.add(Integer.parseInt(tmp1[tmp1.length-i-1]));
				}
			}
			//?????????0??§?????????
			if(list_a.size()>list_b.size()){
				//System.out.println("0??§????????????");
				for(int i=list_b.size();i<list_a.size();i++){
					list_b.add(i,0);
				}
			}

			/*
			//????´???§????????????????¢????
			System.out.println("num1: "+num1+" tmp1.size:"+tmp1.length);
			System.out.println("num2: "+num2+" tmp2.size:"+tmp2.length);
			System.out.print("list_a: ");
			for(int i=0;i<list_a.size();i++){
				System.out.print(list_a.get(i)+",");
			}
			System.out.println();
			System.out.print("list_b: ");
			for(int i=0;i<list_b.size();i++){
				System.out.print(list_b.get(i)+",");
			}
			System.out.println();
			*/

			//???????¨????
			int a,b;
			int loop = list_a.size();
			boolean kuriage=false;

			for(int i=0;i<loop;i++){
				//System.out.println("i="+i+"-----------------------------");
				a=list_a.get(i);
				b=list_b.get(i);
				//System.out.println(i+":a(i)="+a+":b(i)="+b);
				if(a+b>=10){
					if(i<loop-1){
						int tmp = list_a.get(i+1);
						list_a.set(i+1,tmp+1);
					}else{
						list_a.add(1);
						kuriage=true;
					}
				}
				ans.add((a+b)%10);
				//System.out.println("ans(i):"+ans.get(i));
			}
			if(kuriage){
				ans.add(list_a.get(list_a.size()-1));
			}

			//ans??????
			for(int i=ans.size()-1;i>=0;i--){
				System.out.print(ans.get(i));
			}
			System.out.println();

		}

	}

}
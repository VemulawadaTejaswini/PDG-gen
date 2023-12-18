import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean f = true;
		while(true){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a == 0 && b == 0)break;
			if(!f)System.out.println();
			f = false;
			List<Integer> list = new ArrayList<Integer>();
			for(int i=a;i<=b;i++){
				if(i%4==0&&(i%100!=0||i%400==0)){
					list.add(i);
				}
			}
			if(list.isEmpty()){
				System.out.println("NA");
			}else{
				for(int i : list){
					System.out.println(i);
				}
			}
		}
	}
}
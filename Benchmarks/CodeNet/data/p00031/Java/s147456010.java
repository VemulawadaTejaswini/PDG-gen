import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
	public class Main{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			int weight[] = {1,2,4,8,16,32,64,128,256,512};
			List<Integer> list = new ArrayList<Integer>();
			while(sc.hasNext()){
				int target = sc.nextInt();
				for(int i = 9; i > -1 ; i--){
					if(target>=weight[i]){
						target-=weight[i];
						list.add(weight[i]);
					}
				}
				for(int i = list.size();i>1;i--){
					System.out.print(list.get(i-1)+" ");
				}
				System.out.println(list.get(0));
				list.clear();
			}
		}
	}		
import java.util.Scanner;
	public class Main{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			int sum = 0;
			int ave = 0;
			int count = 0;
			while(sc.hasNext()){
				String in = sc.nextLine();
				String[] get = in.split(",");
				int cost = Integer.parseInt(get[0]);
				int num = Integer.parseInt(get[1]);
				sum+=cost*num;
				ave+=num;
				count++;
			}
			System.out.println(sum);
			if(ave%count==0){
				System.out.println(ave/count);
			}else{
				System.out.println((ave/count)+1);
			}
		}
	}		
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static class Data implements Comparable<Data>{
		public String str;
		public int point;
		
		public Data(String str,int p){
			this.str = str;
			point = p;
		}

		@Override
		public int compareTo(Data o) {
			// TODO Auto-generated method stub
			Data another = (Data) o;

			return (this.point > another.point) ? -1
					: this.point == another.point ? 0 : 1;
		}
		
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		boolean is_first = true;
		
		while(true){
			int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			if(is_first == false){
				System.out.println();
			}
			
			Data[] array = new Data[n];
			for(int i = 0; i < n; i++){
				String name = sc.next();
				int win = sc.nextInt();
				int lose = sc.nextInt();
				int drow = sc.nextInt();
				
				array[i] = new Data(name,win*3 + drow);
			}
			
			Arrays.sort(array);
			
			for(Data d : array){
				System.out.println(d.str + "," + d.point);
			}
			
			if(is_first == true){
				is_first = false;
			}
			
		}
		
	}
	
}
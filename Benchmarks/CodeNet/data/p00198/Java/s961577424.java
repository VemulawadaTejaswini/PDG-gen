import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static class Pair{
		private String str1,str2;
		
		public Pair(String str1,String str2){
			this.str1 = str1;
			this.str2 = str2;
		}
		
		@Override
		public boolean equals(Object o){
			if(o instanceof Pair){
				Pair another = (Pair) o;
				
				if((another.str1.equals(this.str1) && another.str2.equals(this.str2))
						|| (another.str1.equals(this.str2) && another.str2.equals(this.str1))){
					return true;
				}else{
					return false;
				}
				
			}else{
				return false;
			}
		}
		
	}
	
	public static class Cube{
		private Pair[] colors;
		
		public Cube(String[] str){
			colors = new Pair[3];
			colors[0] = new Pair(str[0],str[5]);
			colors[1] = new Pair(str[1],str[4]);
			colors[2] = new Pair(str[2],str[3]);
		}
		
		@Override
		public boolean equals(Object o){
			if(o instanceof Cube){
				Cube another = (Cube) o;
				
				for(int i = 0; i < 3; i++){
					boolean found = false;
					for(int j = 0; j < 3; j++){
						if(this.colors[i].equals(another.colors[j])){
							found = true;
							break;
						}
					}
					
					if(found == false){
						return false;
					}
				}
				
				return true;
				
			}else{
				return false;
			}
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = Integer.parseInt(sc.nextLine());
			
			if(n == 0){
				break;
			}
			
			ArrayList<Cube> array = new ArrayList<Cube>(n);
			for(int i = 0; i < n; i++){
				array.add(new Cube(sc.nextLine().split(" ")));
			}
			
			for(int i = 0; i < array.size(); i++){
				for(int j = array.size()-1; j > i; j--){
					if(array.get(i).equals(array.get(j))){
						array.remove(j);
					}
				}
			}
			
			System.out.println(n - array.size());
		}
		
	}
	
}
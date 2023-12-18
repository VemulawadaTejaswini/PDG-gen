import java.util.Scanner;

public class Main{
	public Main(){
		Scanner sc = new Scanner(System.in);
		int c = 0, f;
		while(sc.hasNext()){
			String str = sc.next();
			f = 0;
			for(int i = 0, j = str.length()-1; i < j; i++, j--){
				if(!str.substring(i, i+1).equals(str.substring(j, j+1))){
					f = 1;
					break;
				}
			}
			
			if(f == 0){
				c++;
			}
		}
		
		System.out.println(c);
	}
	
	public static void main(String[] args){
		new Main();
	}
}
import java.util.Scanner;

public class Main{
	public Main(){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String str[] = (sc.nextLine()).split(" ");
			if(str[0].equals("0")){
				break;
			}
			int n = str.length;
			int s = 0;
			int a = 0;
			for(int i = 0; i < n; i++){
				int v = Integer.parseInt(str[i]);
				if(v > 10){
					s += 10;
				} else if(v == 1){
					s += 11;
					a++;
				} else {
					s += v;
				}
				
				while(21 < s && a > 0){
					a--;
					s -= 10;
				}
			}
			if(s > 21){
				s = 0;
			}
			System.out.println(Integer.toString(s));
		}
	}
	
	public static void main(String[] args){
		new Main();
	}
}
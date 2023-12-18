import java.util.Scanner;

public class Main{
	String nu[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
	public Main(){
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int m = nu.length;
		while(sc.hasNext()){
			String str = sc.next();
			int n = str.length();
			
			for(int i = 0, f = 0; i <= n-1; f = 0){
				String s = str.substring(i, i+1);
				for(int j = 1; j < m && i <= n-1; j++){
					if(s.equals(nu[j])){
						String st = s;
						i++;
						s = str.substring(i, i+1);
						for(int k = 0; k < m && i <= n-1;){
							if(s.equals(nu[k])){
								st += s;
								k = 0;
								i++;
								s = str.substring(i, i+1);
							} else {
								k++;
							}
						}
						sum += Integer.parseInt(st);
						f = 1;
						break;
					}
				}
				if(f == 0){
					i++;
				}
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args){
		new Main();
	}
}
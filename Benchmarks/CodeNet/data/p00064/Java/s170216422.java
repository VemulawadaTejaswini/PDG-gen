import java.util.Scanner;

public class Main{
	public Main(){
		Scanner sc = new Scanner(System.in);
		String[] num = {"0","1","2","3","4","5","6","7","8","9"};
		int sum = 0;
		
		while(sc.hasNext()){
			String str = sc.next();
			int n = str.length()-1;
			
			for(int i = 0; i < n; i++){
				for(int j = 0; j < 10; j++){
					if(str.substring(i, i+1).equals(num[j])){
						String s = str.substring(i, i+1);
						i++;
						for(int k = 0; k < 10; k++){
							if(str.substring(i, i+1).equals(num[k])){
								s += num[k];
								i++;
								k = -1;
							}
						}
						sum += Integer.parseInt(s);
					}
				}
			}
		}
		
		System.out.println(sum);
	}
	
	public static void main(String[] args){
		new Main();
	}
}
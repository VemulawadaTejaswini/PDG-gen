import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String newboard = sc.next();
		int answer = 0,x = 0;
		
		for(int i = 0;i < N;i++){
			x = 5;
			String oldboard = sc.next();
			for(int j = 0;j < oldboard.length();j++){
				if(x == -1)
					break;
				if(newboard.charAt(0) == oldboard.charAt(j)){	//１
					for(int k = j + 1;k < oldboard.length();k++){
						if(x == -1)
							break;
						if(newboard.charAt(1) == oldboard.charAt(k)){	//２
							int count = 2;
							int distance = k - j;
							int n = 2;
							for(int s = k + distance;s < oldboard.length();s += distance){
								if(newboard.charAt(n) == oldboard.charAt(s)){
									count++;
								}
								n++;
								
								if(count == newboard.length()){
									answer++;
									x = -1;
									break;
								}
							}
							
						}else{
							break;
						}
					}
				}
			}
		}
		System.out.println(answer + 1);
	}
}
import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int center = sc.nextInt();
		StringBuilder sb = new StringBuilder();

		int min = Math.max(center-num+1, -1000000);
		int max = Math.min(center+num-1, 1000000);

		for(int i = min; i <= max; i++){
			sb.append(i);
			sb.append(" ");
		}

		System.out.println(sb.toString().trim());
	}
}



import java.util.*;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		final String lb = System.getProperty("line.separator");
		StringBuilder sb = new StringBuilder();

		while(true){
			final String[] scores = sc.nextLine().split(" ");
			final int mid = Integer.parseInt(scores[0]);
			final int fin = Integer.parseInt(scores[1]);
			final int ret = Integer.parseInt(scores[2]);
			final int sum = mid + fin;

			if(mid == -1 && fin == -1 && ret == -1) break;

			if(mid == -1 || fin == -1){
				sb.append("F").append(lb);
			} else if(sum >= 80){
				sb.append("A").append(lb);
			} else if(sum >= 65){
				sb.append("B").append(lb);
			} else if(sum >= 50){
				sb.append("C").append(lb);
			} else if(sum >= 30){
				if(ret >= 50){
					sb.append("C").append(lb);
				} else {
					sb.append("D").append(lb);
				}
			} else {
				sb.append("F").append(lb);
			}
		}
		System.out.print(sb.toString());
	}
}
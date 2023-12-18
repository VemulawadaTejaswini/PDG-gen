import java.util.*;
import java.lang.StringBuilder;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String[] st = new String[3];
		int[] n = new int[3];
		do{
			st = sc.nextLine().split(" ");
			for(int i = 0;i<st.length;i++){
				n[i] = Integer.parseInt(st[i]);
			}
			if(n[0]==-1&&n[1]==-1&&n[2]==-1){
				break;
			}else if(n[0]==-1||n[1]==-1){
				sb.append("F\n");
			}else if(n[0]+n[1]>=80){
				sb.append("A\n");
			}else if(n[0]+n[1]>=65){
				sb.append("B\n");
			}else if(n[0]+n[1]>=50){
				sb.append("C\n");
			}else if(n[0]+n[1]>=30){
				if(n[2]>=50){
					sb.append("C\n");
				}else{
					sb.append("D\n");
				}
			}else{
				sb.append("F\n");
			}
		}while(true);
			System.out.print(sb);
	}
}
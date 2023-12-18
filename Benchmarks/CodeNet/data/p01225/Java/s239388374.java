import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while(n-- > 0){
			int[] num = new int[9];
			String[] color = new String[9];
			for(int i=0;i<9;i++) num[i] = sc.nextInt();
			for(int i=0;i<9;i++) color[i] = sc.next();
			System.out.println(judge(num,color)?1:0);
		}
	}

	public static boolean judge(int[] num,String[] color){
		for(int i=0;i<8;i++){
			for(int j=i+1;j<9;j++){
				if(color[i].compareTo(color[j]) > 0){
					int tn = num[i]; num[i] = num[j]; num[j] = tn;
					String tc = color[i]; color[i] = color[j]; color[j] = tc;
				}
				else if(color[i].equals(color[j]) && num[i] > num[j]){
					int tn = num[i]; num[i] = num[j]; num[j] = tn;
					String tc = color[i]; color[i] = color[j]; color[j] = tc;
				}
			}
		}

		int count = 0;
		for(int i=0;i<9;i+=3){
			if(color[i].equals(color[i+1]) && color[i].equals(color[i+2])
				 && (num[i] == num[i+1] && num[i] == num[i+2]
						 || num[i] == num[i+1]-1 && num[i] == num[i+2]-2))
				count++;
		}

		return count==3 ? true : false;
	}
}
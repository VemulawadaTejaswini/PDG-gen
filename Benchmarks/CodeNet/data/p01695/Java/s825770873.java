import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int data = sc.nextInt();
			if(data==0) break;
			String[] str = new String[data];
			int[][] dot = new int[data+1][data];
			str[0] = sc.next();

			for(int i=1; i<data; i++){
				str[i] = sc.next();
				int j=0, k=0;
				while(str[i].charAt(j)=='.') j++;
				while(dot[j][k]!=0) k++;
				dot[j][k] = i;
				str[i] = str[i].substring(j, str[i].length());
			}
			System.out.println(str[0]);

			int j=1, up = 1;
			String[] temp = new String[data];
			Arrays.fill(temp, "");

			while(true){
				if(dot[1][j]==0){
					Makestring(temp, up+1, data-1, dot, 1, 0);
					break;
				}else{
					Makestring(temp, up+1, dot[1][j]-1, dot, 1, 1);
					up = dot[1][j++];
				}
			}

			for(int i=1; i<data; i++){
				temp[i] += "+" + str[i];
				System.out.println(temp[i]);
			}
		}
	}

	static public void Makestring(String[] temp, int up, int down, int[][] dot, int num, int flag){
		if(up<=down){
			if(flag==1){
				for(int i=up; i<=down; i++){
					temp[i] += "|";
				}
			}else{
				for(int i=up; i<=down; i++){
					temp[i] += " ";
				}
			}

			num++;
			int j=1;
			if(up+1<down){
				while(num<dot.length && dot[num][j]<=down){
					if(dot[num][j]==0){
						Makestring(temp, up+1, down, dot, num, 0);
						break;
					}else{
						Makestring(temp, up+1, dot[num][j]-1, dot, num, 1);
						up = dot[num][j++];
					}
				}
			}
		}
	}
}
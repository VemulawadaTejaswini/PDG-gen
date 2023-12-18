import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int h = in.nextInt(),w = in.nextInt();
			if((h|w)==0)break;
			StringBuilder ans = new StringBuilder();
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					ans.append("#");
				}
				ans.append("\n");
			}
			System.out.println(ans.toString());
		}
	}
}
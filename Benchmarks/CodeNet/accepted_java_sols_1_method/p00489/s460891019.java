import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();//チームの個数
		int team[] = new int[x+1];//勝ち点
		int i,j;
		for(i = 0; i < x*(x-1)/2; i++){
			int ta = sc.nextInt();//Aチーム
			int tb = sc.nextInt();//Bチーム
			int pa = sc.nextInt();//Aチーム得点
			int pb = sc.nextInt();//Bチーム得点
			if(pb < pa){
				team[ta]+=3;
			}
			else if(pb == pa){
				team[ta]+=1;
				team[tb]+=1;
			}
			else{
				team[tb]+=3;
			}
		}
		for(i = 1; i < x+1; i++){
			int rank = 1;//順位
			for(j = 1; j < x+1; j++){
				if(team[i] < team[j]){
					rank++;
				}
			}
			System.out.println(rank);
		}	
	}

}
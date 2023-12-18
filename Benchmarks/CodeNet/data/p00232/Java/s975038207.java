import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	long DP(int sai[],int road[],int X,int Y){
		double result = 0;
		int mas[] = new int [Y+1];
		int money[] = new int [Y+1];
		mas[0] = 1;
		double cnt = 1;
		int num = 0;
		while(true){
			cnt = cnt * X;
			num++;
			if(cnt > 10000 || num > 50)break;
			int[] mas2 = new int [Y+1];
			int money2[] = new int [Y+1];
			for(int i = 0;i < X;i++){
				for(int j = 0;j < Y;j++){
					if(j + sai[i] < Y){
						if(road[j+sai[i]] > 100){
							if(j+sai[i]+road[j+sai[i]]-100 > Y){
								mas2[Y]=mas2[Y]+mas[j];
								money2[Y]=money2[Y]+money[j];
							}else{
								mas2[j+sai[i]+road[j+sai[i]]-100]=mas2[j+sai[i]+road[j+sai[i]]-100]+mas[j];
								money2[j+sai[i]+road[j+sai[i]]-100]=money2[j+sai[i]+road[j+sai[i]]-100]+money[j];
							}
						}else{
							mas2[j+sai[i]]=mas2[j+sai[i]]+mas[j];
							if((mas[j]*road[j+sai[i]])+money[j] >= 0){
								money2[j+sai[i]]=money2[j+sai[i]]+(mas[j]*road[j+sai[i]])+money[j];
							}
						}
					}else{
						mas2[Y]=mas2[Y]+mas[j];
						money2[Y]=money2[Y]+money[j];
					}
				}
			}
			for(int i = 0; i < Y;i++){
				mas[i] = mas2[i];
				if(money2[i] < 0){
					money[i] = 0;
				}else{
					money[i] = money2[i];
				}
			}
			if(money2[Y] < 0){
				result = result;
			}else{
				result = result + (money2[Y]/cnt);
			}
		}
		return (int)result;
	}
	void doIt() {
		while(true){
			int X = sc.nextInt();
			int Y = sc.nextInt();
			int Z = sc.nextInt();
			if(X+Y+Z == 0)break;
			int sai[] = new int [X];
			int road[] = new int [Y+1];
			for(int i = 0;i < X;i++){
				sai[i] = sc.nextInt();
			}
			for(int i = 0;i < Z;i++){
				int N = sc.nextInt();
				int E = sc.nextInt();
				int A = sc.nextInt();
				if(E == 1){
					road[N] = A+100;
				}else if(E == 2){
					road[N] = A;
				}else if(E == 3){
					road[N] = -A;
				}
			}
			System.out.println(DP(sai,road,X,Y));
		}
     }
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	new Main().doIt();
    }
}
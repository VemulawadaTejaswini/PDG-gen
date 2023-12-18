import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		int count;
		
		int number[][]= new int[num][3];
		int score[]=new int[num];
		
		for(int i=0; i<num; i++)
			for(int j=0; j<3; j++)
				number[i][j]=sc.nextInt();
		
		
		for(int i=0; i<3; i++){    //何回目？
			for(int j=0; j<num; j++){     //今どこ参照してる？
				int sco=number[j][i];     //一致したらスルーでしなかったら足す
				count=0;
				while(true){
					if(count==num){
						score[j]+=sco;
						break;
					}
					else if(count!=j && sco==number[count][i])
						break;
						
					count++;
					}
				}
			}
		
		
		for(int i=0; i<num; i++)
			System.out.println(score[i]);
		
	}

}
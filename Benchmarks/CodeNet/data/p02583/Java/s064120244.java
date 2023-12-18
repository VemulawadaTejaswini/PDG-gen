import java.util.Arrays;

class Main{

	public static void main (String[] args) {

		Main main = new Main();

		java.util.Scanner sc = new java.util.Scanner(System.in);

		int N = sc.nextInt();
		int[] list = new int [N];

		for (int index=0; index<N; index++) {
			list[index]=sc.nextInt();
		}

		int [] choice = {0,0,0};

		System.out.println(main.get(list,N,0,choice, 0,0));

		sc.close();
	}

	int get (int[] list, int N, int count, int[] choice, int answer, int nowplace) {
		try {
			if (count==3) {
				Arrays.sort(choice);
				if (choice[0]+choice[1]>choice[2]&&choice[0]!=choice[1]&&choice[1]!=choice[2]&&choice[0]!=choice[2]) {
					answer++;
				}
				return answer;
			} else if ((N-nowplace)<(3-count)) {
				choice[count-1]=0;
				return answer;
			}
	
			for (int index=nowplace; index<N; index++) {
				int[]temp = new int [3];
				temp[0] = choice[0];
				temp[1] = choice[1];
				temp[2] = choice[2];
				temp[count]=list[index];
				answer = get (list,N,count+1,temp,answer,index+1);
			}
		} catch (Exception e) {
			return answer;
		}
			return answer;
	}
}
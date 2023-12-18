import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc= new Scanner(System.in);
		
		int N= sc.nextInt();
		
		String space= sc.nextLine();
		
		String strA= sc.nextLine();
		String strB= sc.nextLine();
		
		sc.close();
		
		String[]a=strA.split(" ");
		String[]b=strB.split(" ");
		
		int[]A= new int[N];
		int[]B= new int[N];
		for(int i=0;i<N;i++){
			A[i]= Integer.parseInt(a[i]);
			B[i]= Integer.parseInt(b[i]);
		}
		
		
		int[]cntA= new int[N];
		int[]cntB= new int[N];
		
		for(int i=0;i<N;i++){
			cntA[A[i]]++;
			cntB[B[i]]++;
		}
		
		for(int i=0;i<N;i++){
			if(cntA[i] > N/2 && cntB[i] > N/2){
				System.out.println("No");
				break;
			}
			else{
				System.out.println("Yes");
				for(int j=N-1;i>=0;i++){
					System.out.print(B[j]);
					if(j==0)System.out.println();
					else System.out.print(" ");
				}
			}
			
		}
		
	}

}

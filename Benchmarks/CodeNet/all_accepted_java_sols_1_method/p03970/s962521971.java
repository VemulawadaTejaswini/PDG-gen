import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = "";
		int sum = 0;
		while(sc.hasNext()){
			S = sc.nextLine();
		}
		char[] temp = S.toCharArray();
		char[] right = "CODEFESTIVAL2016".toCharArray();
		for(int i=0;i<temp.length;i++){
			if(temp[i]!=right[i]){
				sum+=1;
			}
		}
		System.out.println(sum);
		sc.close();
	}

}

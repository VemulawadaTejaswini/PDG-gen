import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		int[] num = new int[4];
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String st =sc.nextLine().split(",")[1];
			if(st.equals("A")){
				num[0]++;
			}else if(st.equals("B")){
				num[1]++;
			}else if(st.equals("AB")){
				num[2]++;
			}else if(st.equals("O")){
				num[3]++;
			}
			for(int i = 0 ; i < num.length ; i++){
				System.out.println(num[i]);
			}
		}
		for(int i = 0 ; i < num.length ; i++){
			System.out.println(num[i]);
		}
		sc.close();
	}
}
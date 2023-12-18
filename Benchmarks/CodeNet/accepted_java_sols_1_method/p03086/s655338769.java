import java.util.Scanner;
 
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int ACGT = 0;
		int max = 0;
		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			if(c == 'A' || c == 'C' || c == 'G' || c == 'T'){
				ACGT += 1;
                if(max < ACGT){
					max = ACGT;
                }
			}else{
				if(max < ACGT){
					max = ACGT;
				}
				ACGT = 0;
			}
		}
		System.out.println(max);
	}
}
import java.util.Scanner;

class Main {
	
	public static void main(String[] args){

		int s[]=new int[3];
		int i,j;
		j = 0;
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<s.length;i++){
		s[i]= sc.nextInt();
		}
		
		for(i = 0; i < s.length - 1;i++){
			for(j = s.length - 1; i < j; j--){
				if(s[i] > s[j]){
					int temp = s[j];
					s[j] = s[i];
					s[i] = temp;
				}
			}	
		}
		
		for(i = 0; i < s.length; i++){
			System.out.print(s[i]);
			if(i <s.length - 1){
				System.out.print(" ");
			}
		}
	}

}
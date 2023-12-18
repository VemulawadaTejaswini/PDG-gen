import java.util.Scanner;

class Main{
	public static void main(String[] args){
		boolean[] numH= new boolean[13];
		boolean[] numS= new boolean[13];
		boolean[] numC= new boolean[13];
		boolean[] numD= new boolean[13];
		for(int i=0;i<13;i++){
			numH[i]=true;
			numS[i]=true;
			numC[i]=true;
			numD[i]=true;
		}
		Scanner sc = new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());

		for(int j=0;j<n;j++){
			String[] input = sc.nextLine().split(" ");
			int i=Integer.parseInt(input[1])-1;
			if(input[0].equals("H")){
				numH[i]=false;
			}else if(input[0].equals("S")){
				numS[i]=false;
			}else if(input[0].equals("C")){
				numC[i]=false;
			}else if(input[0].equals("D")){
				numD[i]=false;
			}
		}
		for(int i=0;i<13;i++){
			if(numS[i]){
				System.out.println("S "+(i+1));
			}
		}
		for(int i=0;i<13;i++){
			if(numH[i]){
				System.out.println("H "+(i+1));
			}
		}
		for(int i=0;i<13;i++){
			if(numC[i]){
				System.out.println("C "+(i+1));
			}
		}
		for(int i=0;i<13;i++){
			if(numD[i]){
				System.out.println("D "+(i+1));
			}
		}
	}
}
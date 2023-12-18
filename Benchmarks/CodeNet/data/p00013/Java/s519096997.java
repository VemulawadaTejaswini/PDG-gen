import java.util.Scanner;


public class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] cin =new int[10];
		int temp;
		int i=0;
		while(scan.hasNext()){
			temp=scan.nextInt();
			if(temp!=0){
				cin[i]=temp;
				i++;
			}
			else{
				i--;
				System.out.println(cin[i]);
			}
		}
	}

}
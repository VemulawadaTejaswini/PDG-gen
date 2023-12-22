import java.util.Scanner;
public class Main{
	int [] data =new int[3];
	int hozon;
	
	public void Input(){
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<data.length;i++){
			data[i]= sc.nextInt();
		}
	}
	
	public void Output(){
		for(int n =0;n<data.length;n++){
			System.out.print(data[n]);
			if(n!=data.length-1){
				System.out.print(" ");
			}
		}
		System.out.println("");
	}
	
	public void SortA(){
		for(int j=data.length-1;j>=1;j--){
			for(int k=0;k<j;k++){
				if(data[k]>data[k+1]){
					hozon=data[k+1];
					data[k+1]=data[k];
					data[k]=hozon;
				}
			}
		}
	}
					
	public static void main(String[] args){
		Main obj = new Main();
		obj.Input();
		obj.SortA();
		obj.Output();
	}
}
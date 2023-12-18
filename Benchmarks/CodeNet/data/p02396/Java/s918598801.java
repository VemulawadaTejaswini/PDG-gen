import java.util.Scanner;
public class Main{
	Scanner sc = new Scanner(System.in);
	int sw = 1;
	int i = 1;
	int j;
	int[] x = new int[10001];
	public void compute(){
		while(sw == 1){
			x[i] = sc.nextInt();
				if(x[i] == 0){
					sw = 0;
					break;
				}
			i++;
		}
	}
	
	public void output(){
		for(j=1; j<i; j++){
			System.out.println("Case"+" "+j+": "+x[j]);
		}
	}
	
	public static void main(String[] args){
		Main obj = new Main();
		obj.compute();
		obj.output();
	}
}
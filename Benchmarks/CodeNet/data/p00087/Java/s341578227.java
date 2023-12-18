import java.util.Scanner;

public class Main{
	public Main(){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String[] str = (sc.nextLine()).split(" ");
			int n = str.length;
			int s = 0;
			double stack[] = new double[n+1];
			int p = 0;
			
			for(int i = 0; i < n; i++){
				if(str[i].equals("+")){
					stack[p-1] = stack[p-1] + stack[p];
					p--;
				} else if(str[i].equals("-")){
					stack[p-1] = stack[p-1] - stack[p];
					p--;
				} else if(str[i].equals("*")){
					stack[p-1] = stack[p-1] * stack[p];
					p--;
				} else if(str[i].equals("/")){
					stack[p-1] = stack[p-1] / stack[p];
					p--;
				} else {
					stack[++p] = Double.parseDouble(str[i]);
				}
			}
			
			System.out.println(String.format("%.6f", stack[p]));
		}
	}
	
	public static void main(String[] args){
		new Main();
	}
}
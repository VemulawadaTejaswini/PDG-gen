import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int values[] = new int[3];
		values[0] = Integer.parseInt(sc.next());
		values[1] = Integer.parseInt(sc.next());
		values[2] = Integer.parseInt(sc.next());
		
		for(int i= 0; i< values.length;i++){
			
			for(int j = 0,tmp; j<values.length-1;j++)
			if(values[j] > values[j+1]){
				tmp = values[j+1];
				values[j+1] = values[j];
				values[j] = tmp;
			}
			
		}
		
		System.out.println(values[0] + " " + values[1] + " " + values[2]);
		
		
		sc.close();
		
	}

}

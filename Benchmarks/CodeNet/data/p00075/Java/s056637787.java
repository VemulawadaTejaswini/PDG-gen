import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String line;
		String[] input = new String[3];
		double[] data = new double[3];
		boolean noOutput = true;
		
		while(scan.hasNext()){
			line = scan.nextLine();
			input= line.split(",");
			for(int i=0;i<3;i++){
				data[i] = Double.parseDouble(input[i]);
			}
			
			System.out.println("t");
			if(data[1]/(data[2]*data[2]) >= 25.0){
				System.out.println((int)data[0]);
				noOutput = false;
			}
		}
		
		if(noOutput){
			System.out.println("該当なし");
		}
	}
}
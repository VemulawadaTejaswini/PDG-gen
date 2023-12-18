import java.util.Scanner;

class Main {

	public static void main(String[] args){
		
	    int[][] allData = new int[10][1001];

	    allData[0][0] = 1;

	    for (int iRang = 0; iRang <= 100; iRang++){
	        for (int iSum = 1000; iSum >= 0; iSum--){
	            for (int item = 9; item >= 1; item--){
	                if (iSum - iRang >= 0) allData[item][iSum] += allData[item - 1][iSum - iRang];
	            }
	        }
	    }

	    Scanner input = new Scanner(System.in);
	    while (input.hasNext()){
	    	String[] nAnds = input.nextLine().split(" ");
	    	int valueN = Integer.parseInt(nAnds[0]);
	    	int valueS = Integer.parseInt(nAnds[1]);
	    	if(valueN != 0 || valueS != 0){
	    		System.out.printf("%d\n", allData[valueN][valueS]);
	    	} else {
	    		input.reset();
	    	}
	    }

	    input.close();
	}
}
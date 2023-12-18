import java.util.Scanner;

public class Main {

	public static void main(String[] args){
	    Scanner s = new Scanner(System.in);
	    while(true){
		    int num = s.nextInt();
		    if(num==0)break;
		    double[][] data = new double[num][2];
		    for(int i=0 ; i<num ; i++){
			String[] temp = s.next().split(",");
			for(int j=0 ; j<2 ; j++)
			    data[i][j] = Double.valueOf(temp[j]).doubleValue();
		    }
		    int[] c = new int[num];
		    for(int i=0 ; i<num ; i++){
			for(int j=0 ; j<num ; j++){
			    if(i!=j){
				if((data[i][0]-data[j][0])*(data[i][0]-data[j][0])+(data[i][1]-data[j][1])*(data[i][1]-data[j][1]) <= 4)
				    c[i]++;
			    }
			}
		    }
		    int max = 0;
		    for(int i=0 ; i<num ; i++)
			max = Math.max(max,c[i]);
		    System.out.println(max+1);
		}
      	}
}
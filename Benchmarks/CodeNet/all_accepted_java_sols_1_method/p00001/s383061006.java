import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x= new int[3];
		int temp =0;
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<10; i++){
		     temp =scanner.nextInt();
		    if(temp>x[0]){
		    	 x[2]=x[1];
		    	 x[1]=x[0];
		    	 x[0]=temp;
		     }else if(temp>x[1]){
		    	 x[2]=x[1];
		    	 x[1]=temp;
		     }else if(temp>x[2]){
		    	 x[2]=temp;
		     }
		}
		scanner.close();
		for(int i =0; i<3; i++){
        System.out.println(x[i]);
		}
	}

}
import java.util.Scanner;

class test{

    public static void main(String[] args){

	Scanner scan = new Scanner(System.in);

	int x,i;
	String stock;


	x = scan.nextInt();
       	String[] data = new String[x];

	data[0] = scan.next();
	
	for(i = 1; i < x; i++){
	    data[i] = scan.next();
	    //	}
	    
	    //	for(i = 1; i < x; i++){
       	    if(data[0].compareTo(data[i]) > 0){
		stock = data[0];
		data[0] = data[i];
		data[i] = stock;
	    }
	}
	System.out.println(data[0]);
    }
}
		
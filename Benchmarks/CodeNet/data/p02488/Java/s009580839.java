import java.util.Scanner;

class test{

    public static void main(String[] args){

	int x,i;
	String stock;
    
	Scanner scan = new Scanner(System.in);


	x = scan.nextInt();
       	String[] data = new String[x];

	for(i = 0; i < x; i++){
	    data[i] = scan.next();
	}

	for(i = 1; i < x; i++){
	    if(data[0].compareTo(data[i]) > 0){
		stock = data[0];
		data[0] = data[i];
		data[i] = stock;
	    }
	}
	System.out.println(data[0]);
    }
}
		
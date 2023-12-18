import java.util.Scanner;

class Main{

    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	while(true){

	    String data = scan.next();

	    if(data.equals("apple")){
		System.out.print("peach ");
	    }else if(data.equals("peach")){
		System.out.print("apple ");
	    }else{

		int length = data.length();
		if(data.charAt(length-1)=='.'){
		    if(data.substring(0, length-1).equals("apple")){
			System.out.print("peach");
		    }else if(data.substring(0, length-1).equals("paech")){
			System.out.print("apple");
		    }else{
			System.out.print(data.substring(0,length-1));
		    }
		    System.out.println(".");
		    break;
		}else{
		    
		    System.out.print(data + " ");
		}
	    }
	}
    }
}
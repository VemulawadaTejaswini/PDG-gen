import java.util.Scanner;

class Main{
	
	public static void main(String args[]){
      
	  Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();
      
	  String nums[] = input.split(" ");
	  
	  long blue = Long.parseLong(nums[1]);
	  long red = Long.parseLong(nums[2]);
	  long sum = Long.parseLong(nums[0]);
	  
	  long count = sum / (blue + red);
	  long amari = sum % (blue + red);
	  
	  if(amari < blue){
	    System.out.println((count * blue)+amari);
	  }else{
	    System.out.println((count * blue)+blue);
	  }
	  
	}
}

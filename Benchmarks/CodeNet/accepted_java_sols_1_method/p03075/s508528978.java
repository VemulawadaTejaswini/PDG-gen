import java.util.*;
class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
		int[] numbers = new int[6];
      	int check = 0;
      	for(int i = 0;i<6;i++){
        	numbers[i] = scan.nextInt();
        }
		if(numbers[4]-numbers[0] > numbers[5]){
        	check++;
        }
      	if(check > 0){
        	System.out.println(":(");
        } else {
        	System.out.println("Yay!");
        }
      	
    }
}
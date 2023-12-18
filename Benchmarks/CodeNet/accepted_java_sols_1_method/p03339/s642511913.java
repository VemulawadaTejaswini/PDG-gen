import java.util.*;

class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		final char EAST = 'E';
		final char WEST = 'W';

		int left = 0;	//have to change left;
		int right = 0;	//hava to change right

		int permMax = scan.nextInt();
		String perm = scan.next();

		int min = permMax;

		//count right EAST from alldata
		for(char direction : perm.toCharArray()){
			//change EAST for right
			if(direction == EAST){
				right++;
			}
		}

		//check have to change times for leader
		for(char direction : perm.toCharArray()){
			
			//for right
			if(direction == EAST){
				right--;
			}
		
			//save mincount
			if(min > right + left){
				min = right + left;
			}	

			//for left
			if(direction == WEST){
				left++;
			}
		}

		System.out.println(min);
	}
}

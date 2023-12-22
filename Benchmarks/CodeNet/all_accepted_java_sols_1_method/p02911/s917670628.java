import java.util.*;
 
public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int people = sc.nextInt();
      	int firstPoint = sc.nextInt();
      	int correct = sc.nextInt();
      	int[] point = new int[people];
      	Arrays.fill(point, firstPoint-correct);
      	int correctPerson = 0;
      	for(int i = 0; i < correct; i++){
        	correctPerson = sc.nextInt();
          	point[correctPerson-1] += 1;
        }
      	for(int j = 0; j < people; j++){
        	if(point[j] > 0){
            	System.out.println("Yes");
            }else if(point[j] <= 0){
            	System.out.println("No");
            }
        }     	
	}
}
import java.util.*;
public class Main{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      	int K = sc.nextInt();
      	
      	ArrayList<Integer> heightList = new ArrayList<Integer>();
      	for (int i = 0; i<N;i++){
        	heightList.add(sc.nextInt());
        }
      	int count = 0;
      	for(int height : heightList){
        	if(height>=K) count++;
        }
      	System.out.println(count);
    }
}
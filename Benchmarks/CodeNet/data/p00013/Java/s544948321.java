import java.util.*;
import java.util.ArrayList;
public class Main{
	public static void main(String[] args) {
		int i,j;i=0;
		ArrayList<Integer> array=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
			for(;sc.hasNextInt();){
				array.add(i,sc.nextInt());
				if( array.get(i)==0){
                  System.out.println(array.get(i-1));i--;}
				else i++;
			
			
		}
	}
}
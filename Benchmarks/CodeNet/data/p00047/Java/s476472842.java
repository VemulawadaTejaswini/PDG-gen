import java.util.*;
import java.awt.geom.*;
import java.io.*;
public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		int [] data = new int[3];
		for(int i = 0 ; i < 3; i++){
			data[i] = i;
		}
		while(sc.hasNext()){
			String [] input = sc.next().split(",");
			int change1 = input[0].charAt(0) - 'A';
			int change2 = input[1].charAt(0) - 'A';
			int temp = data[change1];
			data[change1] = data[change2];
			data[change2] = temp;
		}
		int ind = -1;
		for(int i = 0; i < 3; i++){
			if(data[i] == 0){
				ind = i;
				break;
			}
		}
		System.out.println((char) (ind + 'A'));
	}

	public static void main(String [] args){
		new Main().doit();
	}
}
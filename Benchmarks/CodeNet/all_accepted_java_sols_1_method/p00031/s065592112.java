import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			String st = Integer.toBinaryString(input.nextInt());
			int index = 0;
			ArrayList<Integer> lst = new ArrayList<Integer>();
			for(int i = st.length()-1; i >= 0 ; i--){
				if(st.charAt(i) == '1')lst.add((int)(Math.pow(2, index)));
				index++;
			}
			for(int i = 0 ; i < lst.size() ; i++){
				if(i != lst.size()-1){
					System.out.print(lst.get(i)+" ");
				}else{
					System.out.println(lst.get(i));
				}
			}
		}
		String st = Integer.toBinaryString(5);
	}

}
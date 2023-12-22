import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		int temp;

		for(int i=0; i<n; i++){
			temp = in.nextInt();
			if(i==0){
				a.add(temp);
			}else if(i>0 && a.get(a.size()-1) != temp){
				a.add(temp);
			}
		}

		int count = 1;
		boolean con = false;
		for(int i=1; i<a.size()-1; i++){
			if(a.get(i-1) < a.get(i) && a.get(i) > a.get(i+1)){
				if(con == false){
					count++;
					con = true;
				}else{
					con = false;
				}
			}else if(a.get(i-1) > a.get(i) && a.get(i) < a.get(i+1)){
				if(con == false){
					count++;
					con = true;
				}else{
					con = false;
				}
			}else{
				con = false;
			}
		}

		System.out.println(count);

	}

}

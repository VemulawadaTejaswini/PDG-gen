import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		String[] str=(sc.next()).split("");

		sc.close();

		List<String> list=new ArrayList<String>();

		int cnt=0;

		for(int i=0;i<4;i++){
			if(list.contains(str[i])){
				cnt++;
			}else{
				list.add(str[i]);
			}
		}

		if(list.size()>2){
			System.out.println("No");
		}else{
			if(cnt==2){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}


	}
}


import java.util.ArrayList;
import java.util.Scanner;


public class Main {
public static void main (String[] args){


	Scanner sc =new Scanner(System.in);
	ArrayList<Integer> list=new ArrayList<Integer>();

	while(sc.hasNext()) {
		list.add(Integer.parseInt(sc.next()));
	}

	int num= list.get(0);
	int sum=list.get(1);
	int i=0;
	
	if(sum==1) {
		System.out.print(0);
	}else if(num>=sum) {
		System.out.print(1);
	}else {
		sum=sum-num;
		i++;
		num--;
		while(true){
			sum=sum-num;
			i++;

			if(sum<1) {
				System.out.print(i);
				break;
			}
		}
	}
}
}


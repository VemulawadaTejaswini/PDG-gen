import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A=0;
		int B=0;

		int n = sc.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;n>i;i++) {
			int b=sc.nextInt();
			list.add(b);
		}
		//System.out.println(list.size());
        for(int i=0;list.size()>i;i++) {
        	A=list.get(i);
        	//System.out.println(A);
        	for(int j=i;list.size()>j;j++) {
        		if(A==list.get(j)&&i!=j) {
        			break;
        		}
        		else if((j+1)==list.size()) {
        			B++;
        		}
        		//System.out.println(j);
        	}
        }
        System.out.println(B);
	}

}

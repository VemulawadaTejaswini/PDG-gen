import java.util.Vector;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		Vector<Integer> vec=new Vector<>();
		
		int n=scan.nextInt();
		for(int i=0;i<n;i++){
			int com=scan.nextInt();
			if(com==0)
				vec.add(scan.nextInt());
				
			if(com==1)
				System.out.println(vec.elementAt(scan.nextInt()));
				
			if(com==2)
				vec.remove(vec.size()-1);
		}
	}
}

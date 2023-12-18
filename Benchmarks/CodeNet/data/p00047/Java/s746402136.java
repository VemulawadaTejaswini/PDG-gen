import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String[] cup={"A","B","C"};
		while(sc.hasNext()){
			String[] change=sc.next().split(",");
			for(int i=0;i<3;i++){
				if(cup[i].equals(change[0])){
					for(int j=0;j<3;j++){
						if(cup[j].equals(change[1])){
							cup[i]=change[1];
							cup[j]=change[0];
							break;
						}
					}
					break;
				}
			}
		}
		if(cup[0].equals("A")){
			System.out.println("A");
		}
		if(cup[1].equals("A")){
			System.out.println("B");
		}
		if(cup[2].equals("A")){
			System.out.println("C");
		}
	}
}
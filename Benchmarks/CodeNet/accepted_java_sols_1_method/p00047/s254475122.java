import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String[] cup={"A","B","C"};
		boolean[] ball={true,false,false};
		while(sc.hasNext()){
			String[] change=sc.next().split(",");
			for(int i=0;i<3;i++){
				if(cup[i].equals(change[0])){
					for(int j=0;j<3;j++){
						if(cup[j].equals(change[1])){
							if(ball[i]){
								ball[i]=false;
								ball[j]=true;
							}else if(ball[j]){
								ball[j]=false;
								ball[i]=true;
							}
							break;
						}
					}
					break;
				}
			}
		}
		for(int i=0;i<3;i++){
			if(ball[i]){
				System.out.println(cup[i]);
				break;
			}
		}
	}
}
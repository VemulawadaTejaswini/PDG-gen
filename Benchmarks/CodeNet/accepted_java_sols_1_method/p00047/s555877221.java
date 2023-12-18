import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,tmp,n[]={0,1,2,3};

		while(sc.hasNext()){
			String str[]=sc.next().split(",");
			if(str[0].equals("A") && str[1].equals("B")){
				tmp=n[1];
				n[1]=n[2];
				n[2]=tmp;
			}
			if(str[0].equals("A") && str[1].equals("C")){
				tmp=n[1];
				n[1]=n[3];
				n[3]=tmp;
			}
			if(str[0].equals("B") && str[1].equals("A")){
				tmp=n[1];
				n[1]=n[2];
				n[2]=tmp;
			}
			if(str[0].equals("B") && str[1].equals("C")){
				tmp=n[3];
				n[3]=n[2];
				n[2]=tmp;
			}
			if(str[0].equals("C") && str[1].equals("A")){
				tmp=n[1];
				n[1]=n[3];
				n[3]=tmp;
			}
			if(str[0].equals("C") && str[1].equals("B")){
				tmp=n[3];
				n[3]=n[2];
				n[2]=tmp;
			}
		}//while
		for(i=1;i<4;i++){
			if(n[i]==1){
				if(i==1){
					System.out.println("A");
				}
				else if(i==2){
					System.out.println("B");
				}
				else if(i==3){
					System.out.println("C");
				}

			}
		}
	}
}
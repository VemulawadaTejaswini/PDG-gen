import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		boolean flag =true;
		for(int i=0;i<=25;i++){
			int all = i*4;
			while(all<=100){
				if(n==all&&n!=0){flag=false;break;}
				all=all+7;
			}
			if(flag==false){break;}
		}
		if(flag){System.out.println("No");}
		else{System.out.println("Yes");}
		
	}
}
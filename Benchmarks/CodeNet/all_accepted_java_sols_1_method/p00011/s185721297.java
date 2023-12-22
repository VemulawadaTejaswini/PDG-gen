import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int hor=input.nextInt();
		int ver=input.nextInt();
		
		int[] num=new int[hor];
		
		for(int i=0;i<num.length;i++){
			num[i]=i+1;
		}
		
		for(int i=0;i<ver;i++){
			String[] str=input.next().split(",");
/*			System.out.println(str[0]+" "+str[1]);*/
			int a=Integer.parseInt(str[0]);
			int b=Integer.parseInt(str[1]);
			int change=num[a-1];
			num[a-1]=num[b-1];
			num[b-1]=change;
		}
		
		for(int i=0;i<num.length;i++){
			System.out.println(num[i]);
		}
		
	}

}
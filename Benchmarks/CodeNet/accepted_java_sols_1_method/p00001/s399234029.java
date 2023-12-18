import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int max1=0,
			max2=0,
			max3=0;
		for(int i=0;i<10;i++){
			int newNum=input.nextInt();
			if(newNum>max1){
				max3=max2;
				max2=max1;
				max1=newNum;
			}
			else if(newNum>max2 && newNum<=max1){
				max3=max2;
				max2=newNum;
			}
			else if(newNum>max3 && newNum<=max2){
				max3=newNum;
			}
			
			//System.out.println(max1+" "+max2+" "+max3);
		}
		
		System.out.println(max1);
		System.out.println(max2);
		System.out.println(max3);
	}

}
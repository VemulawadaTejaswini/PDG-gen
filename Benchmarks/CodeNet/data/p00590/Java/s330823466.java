
import java.util.*;
import java.lang.*;
import java.io.*;
class PireOfPrime {

	public static void main(String[] args) {
		int inputNumber;
		System.out.println("Enter An integer Number:");
		Scanner in =new Scanner(System.in);
		inputNumber=in.nextInt();
		int i,count=0;
		for(i=1;i<=inputNumber;i++){
		if((i%2==0||i%3==0||i%4==0||i%5==0||i%7==0||i%8==0||i%9==0)&&(i!=2&&i!=3&&i!=5&&i!=7)){
			
		}
		else {
			if(i!=1&&(inputNumber+1-i)!=1){
			////////inner block
			if(((inputNumber+1-i)%2==0||(inputNumber+1-i)%3==0||(inputNumber+1-i)%4==0||(inputNumber+1-i)%5==0||(inputNumber+1-i)%6==0||(inputNumber+1-i)%7==0||(inputNumber+1-i)%8==0||(inputNumber+1-i)%9==0)&&((inputNumber+1-i)!=2&&(inputNumber+1-i)!=3&&(inputNumber+1-i)!=5&&(inputNumber+1-i)!=7))
			{
				
			}
			else{
				
				
				count++;
				
			}
			/////inner block ends here
			
		}
		}
	}
System.out.println("-----------------\n"+inputNumber+" has "+count+" Pairs");

	}
}
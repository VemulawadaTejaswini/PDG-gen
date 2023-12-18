
import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int sortLong=input.nextInt();
		
		int[] sortNumber=new int[sortLong];
		
		for(int i=0;i<sortLong;i++)
			sortNumber[i]=input.nextInt();
		
		int number=sort(sortNumber);
		for(int i=0;i<sortNumber.length-1;i++)
			System.out.print(sortNumber[i]+" ");
		System.out.println(sortNumber[sortNumber.length-1]);
		
		System.out.println(number);
		
	}
	
	public static int sort(int[] sortArray){
		int min=0;
		int minPlace=0;
		int changeFrequency=0;
		for(int i=0;i<sortArray.length-1;i++){
			min=sortArray[i+1];
			for(int j=i+1;j<sortArray.length;j++){
				if(sortArray[j]<min){
					min=sortArray[j];
					minPlace=j;
				}
			}
			if(min<sortArray[i]){
				sortArray[minPlace]=sortArray[i];
				sortArray[i]=min;
				changeFrequency++;
			}
				
		}
		
		return changeFrequency;
	}

}
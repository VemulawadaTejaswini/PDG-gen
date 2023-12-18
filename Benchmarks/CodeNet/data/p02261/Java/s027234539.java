import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int circle=input.nextInt();
		char[][] arr=new char[circle][2];
		char[][] arr1=new char[circle][2];
		String[] afterArr=new String[circle];
		String[] afterArr1=new String[circle];
		for(int i=0;i<circle;i++){
			String str=input.next();
			arr[i][0]=str.charAt(0);
			arr[i][1]=str.charAt(1);
		}
		for(int i=0;i<arr.length;i++){
			arr1[i][0]=arr[i][0];
			arr1[i][1]=arr[i][1];
		}
		arr=bubbleSort(arr);
		arr1=selectionSort(arr1);
		for(int i=0;i<afterArr.length;i++){
			afterArr[i]=String.valueOf(arr[i]);
			afterArr1[i]=String.valueOf(arr1[i]);
		}
		print(afterArr);
		System.out.println("Stable");
		print(afterArr1);
		if(isStable(afterArr,afterArr1))
			System.out.println("Stable");
		else
			System.out.println("Not Stable");
	}
	
	public static char[][] bubbleSort(char[][] arr){
		for(int k=0;k<arr.length-1;k++){
			for(int n=0;n<arr.length-1-k;n++){
				if(arr[n+1][1]<arr[n][1]){
					char change=arr[n+1][1];
					arr[n+1][1]=arr[n][1];
					arr[n][1]=change;
					
					change=arr[n+1][0];
					arr[n+1][0]=arr[n][0];
					arr[n][0]=change;
				}
			}
			
		}
		return arr;
	}
	
	
	
    public static char[][] selectionSort(char[][] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int k = i;
            // ??????????°????????°????
            for (int j = i + 1; j < n; j++) {
                if (a[j][1] < a[k][1]) {
                    k = j;
                }
            }
            // ?°?????°?????????°????????????????°?
            if (k > i) {
                char tmp = a[i][1];
                a[i][1] = a[k][1];
                a[k][1] = tmp;
                
                tmp = a[i][0];
                a[i][0] = a[k][0];
                a[k][0] = tmp;
            }
        }
        return a;
    }
	
	public static boolean isStable(String[] arr1,String[] arr2){
		for(int i=0;i<arr1.length;i++){
			if(!arr1[i].equals(arr2[i]))
				return false;
		}
		
		return true;
	}
	
	public static void print(String[] arr){
		for(int i=0;i<arr.length;i++){
			if(i==arr.length-1)
				System.out.println(arr[i]);
			else
				System.out.print(arr[i]+" ");
		}
	}

}
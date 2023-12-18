import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void BubbleSort(String[] array){
		String[] array_cl=(String[])array.clone();

        int len=array_cl.length;
        String swap;
        for(int i=0;i<len-1;i++){
            for(int j=len-1;i<j;j--){

                if(array_cl[j].charAt(array_cl[j].length()-1)<array_cl[j-1].charAt(array_cl[j-1].length()-1)){
                    swap=array_cl[j];array_cl[j]=array_cl[j-1];array_cl[j-1]=swap;
                }
            }
        }
        for(int i=0;i<len;i++){
        System.out.print(array_cl[i]);
        if(i!=len-1)System.out.print(" ");}
        System.out.println();

        //array??¨array_cl???????????????
		int a,b, cnt;
		cnt=a=b=0;

        for(int i=0;i<len-1;i++){
        	if(array_cl[i].charAt(array_cl[i].length()-1)==array_cl[i+1].charAt(array_cl[i+1].length()-1)){
        		for(int j=0;j<len;j++){
        			if(array[j]==array_cl[i])a=j;
        			if(array[j]==array_cl[i+1])b=j;
                	}

        		if(a>b){cnt++;break;}
        	}
        }
        if(cnt>0)System.out.println("Not Stable");
        if(cnt==0)System.out.println("Stable");
    }

	public static void SelectionSort(String[] array){
		String[] array_cl=(String[])array.clone();
		int len=array_cl.length;
		int min;
		String swap;
		for(int i=0;i<len-1;i++){
			min=i;
			for(int j=i+1;j<len;j++){
			if(array_cl[min].charAt(array_cl[min].length()-1)>array_cl[j].charAt(array_cl[j].length()-1))min=j;
			}
			if(min!=i){
				swap=array_cl[i];array_cl[i]=array_cl[min];array_cl[min]=swap;

		}

		}

		//??\????????????
		for(int i=0;i<len;i++){
		System.out.print(array_cl[i]);
		if(i!=len-1)System.out.print(" ");}
		System.out.println();

		int a,b, cnt;
		cnt=a=b=0;

        for(int i=0;i<len-1;i++){
        	if(array_cl[i].charAt(array_cl[i].length()-1)==array_cl[i+1].charAt(array_cl[i+1].length()-1)){
        		for(int j=0;j<len;j++){
        			if(array[j]==array_cl[i])a=j;
        			if(array[j]==array_cl[i+1])b=j;
                	}

        		if(a>b){cnt++;break;}
        	}
        }
        if(cnt>0)System.out.println("Not Stable");
        if(cnt==0)System.out.println("Stable");
	}

	public static void main(String[] args){

		int n;
		String str;
		String[] str_array;
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

		try{
		n=Integer.parseInt(reader.readLine());
		str=reader.readLine();
		str_array=str.split(" ");

		BubbleSort(str_array);
		SelectionSort(str_array);
		}catch(IOException e){
			//????????????
		}

	}

}
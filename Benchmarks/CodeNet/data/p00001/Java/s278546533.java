import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws IOException {
		
		int i=0,j=0;
		int[] mount = new int[10];
		int[] h_mount = {0,0,0};
		String str;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				
		while(i<10){
			str=new String(in.readLine());
			mount[i]=Integer.parseInt(str);
			
			if(mount[i]<0 || mount[i]>10000){
				i--;
			}
			
			i++;
		}
		
		sortMethod(mount,10);
		for(i=0;i<3;i++){
			h_mount[i]=mount[i];
			System.out.println(h_mount[i]);
		}


	}
	
	public static void sortMethod(int[] array,int num){
		int tmp;
		int x,y;
		for(x=0;x<num-1;x++){
			for(y=x+1;y<num;y++){
				if(array[x]<array[y]){
					tmp = array[x];
					array[x]=array[y];
					array[y]=tmp;
				}
			}
		}
	}

}
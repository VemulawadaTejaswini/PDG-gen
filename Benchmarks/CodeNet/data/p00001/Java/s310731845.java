
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
	public static void main(String[] args) throws NumberFormatException, IOException{
		int[] mountains = new int[10];
		int[] big = new int[3];
		boolean ishas=false;
		int cursor=0;
		
		BufferedReader d= new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<10; i++){
        	mountains[i]=Integer.valueOf(d.readLine());
        }	
		
		
		big[0]=mountains[0];
		for(;cursor<3;cursor++){
			for(int i=0;i<10;i++){
				ishas=false;
				if(cursor<3){		
					if(big[cursor]<mountains[i]){
						for(int j=0;j<cursor;j++){
							if(big[j]==mountains[i]) ishas=true;
						}
						if(!ishas){
							big[cursor]=mountains[i];
						}
					}
				}
			}
		}
		for(int i=0;i<3;i++){
			System.out.println(big[i]);
		}
	}
}
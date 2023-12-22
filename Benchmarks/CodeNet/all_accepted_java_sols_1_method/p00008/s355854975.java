import java.io.*;

public class Main{

	public static void main(String args[]){

		
		try{
			BufferedReader r =
					new BufferedReader(new InputStreamReader(System.in));

			String s;

			while (( s = r.readLine() ) != null){

				int count = 0;
				for(int i=0; i<10; i++){
					for(int j=0; j<10; j++){
						for(int k=0; k<10; k++){
							for(int l=0; l<10; l++){
								if( (i+j+k+l)== Integer.parseInt(s)){
									count ++;
								}	
							}
						}
					}
				}
				
				System.out.println(count);
				
			}
			
			
			
		} catch(IOException e){
		}

	}


}
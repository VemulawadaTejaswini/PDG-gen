import java.io.*;

class Main{

    public static void main(String[] args)throws IOException{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	while(true){
	    String input = br.readLine();
	    String[] div = input.split(" ");
	    int height = Integer.parseInt(div[0]);
	    int width = Integer.parseInt(div[1]);

	    if(height == 0 && width == 0){
		break;
	    }

	    for(int i = 0; i < height; i++){
		
		if(i == 0 || i == height - 1){
		    
		    for(int j = 0; j < width; j++){
			System.out.printf("#");
		    }
		    System.out.printf("\n");
		    
		}else{
		    
		    System.out.printf("#");
		    for(int j = 0; j < width - 2; j++){
			System.out.printf(".");
		    }
		    System.out.printf("#\n");
		}
		
	    }
	    System.out.printf("\n");
	    
	}

    }

}
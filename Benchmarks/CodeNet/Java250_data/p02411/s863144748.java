import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        	while(true){
			String str = br.readLine();
            		String[] str2 = str.split(" ");
		        int a = Integer.parseInt(str2[0]);
		        int b = Integer.parseInt(str2[1]);
		        int c = Integer.parseInt(str2[2]);
		        int x = a + b;
		        if(a == -1 && b == -1 && c == -1){
				break;
            		}
            		if(a == -1 || b == -1){
                		System.out.println("F");
            		}
            		else if(x >= 80){
                		System.out.println("A");
            		}
            		else if(x >= 65 && x < 80){
                		System.out.println("B");
           		}
            		else if(x >= 50 && x < 65){
                		System.out.println("C");
            		}
            		else if(x >= 30 && x < 50){
                		if(c >= 50){
                    			System.out.println("C");
                		}else{
                    			System.out.println("D");
                		}
            		}else if(x < 30){
                		System.out.println("F");
            		}
        	}
    	}
}
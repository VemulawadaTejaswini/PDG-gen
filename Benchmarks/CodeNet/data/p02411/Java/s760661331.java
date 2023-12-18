import java.io.*;

public class Main{
public static void main(String[] args) throws IOException{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	while(true){
		String[] str = br.readLine().split(" ");
		int m = Integer.parseInt(str[0]);
		int f = Integer.parseInt(str[1]);
		int r = Integer.parseInt(str[2]);
		int t = m + f;	
	
		if(m == -1 && f == -1 && r == -1){
			break;
		}
         
                if( m == -1 || f == -1){
			System.out.println("F");
		}else if(t >= 80){
			System.out.println("A");
		}else if(t >= 65 && t < 80){
			System.out.println("B");
		}else if(t >= 50 && t < 65){
			System.out.println("C");
		}else if(t >= 30 && t < 50){
			if(f >= 50){
				System.out.println("C");
			}else{
				System.out.println("D");
			}
		}else{
			System.out.println("F");
		}
	}
}
} 
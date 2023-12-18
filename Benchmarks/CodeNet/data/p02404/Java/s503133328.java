import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
	
		try{
	BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

	while(true){
    String input = buf.readLine();
	String[] strAry = input.split(" ");
    int H = Integer.parseInt(strAry[0]);
    int W = Integer.parseInt(strAry[1]);
	
	if(H == 0  && W == 0){
		break;
	}
	
	for (int i = 0; i < H; i++) {
		for(int j = 0; j < W; j++){
			if((i == 0 || i == H-1) || (j ==0 || j == W-1)){
			System.out.printf("#");
				}else{
			System.out.printf(".");
			}
		}
		System.out.printf("\n");
	}
	System.out.printf("\n");
	}
} catch (Exception e) {

	System.out.println("????????????");
	
}
		 }
    }
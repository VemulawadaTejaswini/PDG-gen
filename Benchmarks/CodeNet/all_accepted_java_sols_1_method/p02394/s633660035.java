import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] array = br.readLine().split(" ");
        int W = Integer.parseInt(array[0]);
        int H = Integer.parseInt(array[1]);
        int x = Integer.parseInt(array[2]);
        int y = Integer.parseInt(array[3]);
        int r = Integer.parseInt(array[4]);
        if(r<=x&&x<=W-r&&r<=y&&y<=H-r){
    		System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
	}
}
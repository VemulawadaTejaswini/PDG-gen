public class Main{
    public static void main(String args[]) throws Exception {
    	for(int i=1;i<10;i++){
    		int sum = 0;
    		for(int j=1;j<10;j++){
    			sum = sum + i;
    			System.out.println(i + "x" + j + "=" + sum);
    		}
    	}
    }
}
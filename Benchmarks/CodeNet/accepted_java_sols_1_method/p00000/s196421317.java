public class Main {
	public static void main(String args[]){
		int i = 1;
		int j = 1;
		
		for(;i<10;i++){
			for(;j<10;j++){
				System.out.println(i + "x" + j + "=" + (i*j));
			}
			j=1;
		}
	}
}
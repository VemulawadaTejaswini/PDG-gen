public class Main{
	
	public static void main(String[] args){
		if(java.util.stream.IntStream.rangeClosed(1, 9).peek(I -> {
			if(java.util.stream.IntStream.rangeClosed(1, 9).peek(J ->
				System.out.println(I + "x" + J + "=" + I * J)
			).count() == 0){}
		}).count() == 0) {}
	}
	
}
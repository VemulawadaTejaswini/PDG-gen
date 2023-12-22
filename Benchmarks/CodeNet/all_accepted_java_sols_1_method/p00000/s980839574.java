import java.util.stream.IntStream;

class Main {
	public static void main(String[] argv){
		IntStream.rangeClosed(1, 9).forEach(n->{
			IntStream.rangeClosed(1, 9).forEach(m->{
				System.out.println(n+"x"+m+"="+(n*m));
			});
		});
	}
}
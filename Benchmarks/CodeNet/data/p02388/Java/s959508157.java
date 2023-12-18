import java.util.Scanner;

abstract class Product {
	
	public abstract Integer calc(Integer x);
}

abstract class Factory {
	
	public Product create() {
		
		return createProduct();
	}
	
	protected abstract Product createProduct();
}

class Xcubic extends Product {

	@Override
	public Integer calc(Integer x) {
		
		return x * x * x;
	}
	
}

class XCubicFactory extends Factory {

	@Override
	protected Product createProduct() {
		
		return new Xcubic();
	}
	
}
public class Main {

	public static void main(String[] args) {
		
		System.out.println(new XCubicFactory().create().calc(Integer.parseInt(new Scanner(System.in).next())));

	}

}


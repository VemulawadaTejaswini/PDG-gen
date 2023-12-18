// Calculation of Expressions
import java.util.*;

public class Main {
	static String formula;
	static int pos;
	static boolean overflow;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			formula = sc.next();
			pos = 0;
			overflow = false;
			Complex c = parse();
			if (overflow)
				System.out.println("overflow");
			else
				System.out.println(c);
		}
		sc.close();
	}

	static Complex parse() {
		Complex result = term();
		while (pos < formula.length()) {
			if (formula.charAt(pos++) == '+')
				result = result.add(term());
			else
				result = result.sub(term());
		}
		return result;
	}

	static Complex term() {
		Complex result = mul();
		while (pos < formula.length() && formula.charAt(pos) == '*') {
			pos++;
			result = result.mul(mul());
		}
		return result;
	}

	static Complex mul() {
		Complex result;
		if (Character.isDigit(formula.charAt(pos)))
			return new Complex(number(), 0);
		if (formula.charAt(pos++) == 'i')
			return new Complex(0, 1);
		result = term();
		while (pos < formula.length() && formula.charAt(pos) != ')') {
			if (formula.charAt(pos++) == '+')
				result = result.add(term());
			else
				result = result.sub(term());
		}
		pos++;
		return result;
	}

	static int number() {
		int result = 0;
		while (pos < formula.charAt(pos)
				&& Character.isDigit(formula.charAt(pos))) {
			result *= 10;
			result += formula.charAt(pos++) - '0';
		}
		return result;
	}

	static class Complex {
		int real, imaginary;

		Complex(int r, int i) {
			real = r;
			imaginary = i;
			checkOverflow();
		}

		Complex add(Complex anotherComplex) {
			return new Complex(this.real + anotherComplex.real, this.imaginary
					+ anotherComplex.imaginary);
		}

		Complex sub(Complex anotherComplex) {
			return new Complex(this.real - anotherComplex.real, this.imaginary
					- anotherComplex.imaginary);
		}

		Complex mul(Complex anotherComplex) {
			return new Complex(this.real * anotherComplex.real - this.imaginary
					* anotherComplex.imaginary, this.real
					* anotherComplex.imaginary + this.imaginary
					* anotherComplex.real);
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			if (real == 0) {
				if (imaginary == 0)
					return sb.append("0").toString();
				return sb.append(imaginary).append("i").toString();
			}
			sb.append(real);
			if (imaginary == 0)
				return sb.toString();
			if (imaginary < 0)
				return sb.append(imaginary).append("i").toString();
			return sb.append("+").append(imaginary).append("i").toString();
		}

		void checkOverflow() {
			if (Math.abs(real) <= 10000 && Math.abs(imaginary) <= 10000)
				return;
			pos = formula.length();
			overflow = true;
		}
	}
}
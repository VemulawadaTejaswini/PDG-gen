import java.io.BufferedReader;
import java.io.InputStreamReader;

//public class Problem1102_CalculationOfExpressions {
public class Main {
	
	public static void main(String[] args) {
		try {
		//	Problem1102_CalculationOfExpressions test = new Problem1102_CalculationOfExpressions();
			Main test = new Main();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String line;
			while((line = reader.readLine()) != null && line.isEmpty() == false) {
				try {
				System.out.println(test.solve(test.createTree(line)));
				} catch (Exception e) {
					System.out.println("overflow");
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	CalculationTree createTree(String expression) throws OverflowException {
		CalculationNode rootNode = createNode(expression);
		return new CalculationTree(rootNode);
	}
	private CalculationNode createNode(String expression) throws OverflowException {
		String[] dividedExpression = divideExpression(expression);
		
		if(dividedExpression.length == 1) {	//or"i"ÌÝðo
			if(dividedExpression[0].equals("i")) {
				return new CalculationNode(0, 1);
			} else {
				int nodesInteger = Integer.parseInt(dividedExpression[0]);
				CalculationNode node = new CalculationNode(nodesInteger,0);
			/*	if(node.getComplexNumber().isOverflow()) {
					throw new OverflowException();
				}	*/
				return node;
			}
		} else if(dividedExpression.length == 2) {
		//	System.out.println("dividedExpression.length == 2\t\"" + dividedExpression[1] + "\"ðTõJn");
			return createNode(dividedExpression[1]);
		} else {	//(dividedExpression.length == 3) 
			CalculationNode node;
		//	System.out.println("dividedExpression.length == 3\t\"" + dividedExpression[0] + "\"ðTõJn");
		//	System.out.println("dividedExpression.length == 3\t\"" + dividedExpression[2] + "\"ðTõJn");
		//	System.out.println("dividedExpression.length == 3\t\"" + dividedExpression[1] + "\"ÌLðo");
			if(dividedExpression[1].equals("+")) {
				node = new CalculationNode(createNode(dividedExpression[0]), createNode(dividedExpression[2]), CalculationNode.PLUS);
			} else if(dividedExpression[1].equals("*")) {
				node = new CalculationNode(createNode(dividedExpression[0]), createNode(dividedExpression[2]), CalculationNode.MULTIPLY);
			} else {
				node = new CalculationNode(createNode(dividedExpression[0]), createNode(dividedExpression[2]), CalculationNode.MINUS);
			}
			return node;
		}
	}
	private String[] divideExpression(String expression) {
		String[] resultArray;
		
		int operatorPosition = getOperatorPosition(expression);
		if(operatorPosition == 0) {	//0ÆÈéÌÍ(---)©ÌÝÇ¿ç©µ©È¢
			if(expression.endsWith(")")) {
				resultArray = new String[2];
				resultArray[0] = null;
				resultArray[1] = expression.substring(1,expression.length()-1);	//ÅÆÅãðí
			} else {
				resultArray = new String[1];
				resultArray[0] = expression;
			}
		} else {
			resultArray = new String[3];
			resultArray[0] = expression.substring(0, operatorPosition);
			resultArray[1] = Character.toString(expression.charAt(operatorPosition));
			resultArray[2] = expression.substring(operatorPosition +1);
		}
		return resultArray;
	}
	/*
		êÔÅãÉvZ³êéªÌLª(+-*)ðÔ·
		(---)ÌêÍ0ðÔ·
	*/
	private int getOperatorPosition(String expression) {
		int parenthesis = 0;
		int positionCandidate = 0;
		for(int i = expression.length() -1; -1 < i; i--) {
			char charOfIndex = expression.charAt(i);
		//	System.out.println(charOfIndex);
			if(charOfIndex == ')') {
				parenthesis++;
			} else if(charOfIndex == '(') {
				parenthesis--;
			} else if(parenthesis == 0) {
				if(charOfIndex == '+' || charOfIndex == '-') {	//JbRàÅÍÈ¢êÅêÔãëÉ é"+/-"ÍK¸ÅãÉvZ³êé
					return i;
				} else if(charOfIndex == '*' && positionCandidate == 0) {
					positionCandidate = i;		//JbRàÅÍÈ¢êÅêÔãëÉ é"*"Í"+"ªÈ¯êÎÅãÉvZ³êé
				}
			}
		}
		
		return positionCandidate;
	}
	String solve(CalculationTree tree) {
		String result;
		try {
			ComplexNumber answer = tree.getComplexNumbersAnswer();
			result = answer.toString();
		} catch (OverflowException e) {
			result = "overflow";
		}
		return result;
	}
	private class CalculationTree {
		private final CalculationNode ROOT;
		
		CalculationTree(CalculationNode node) {
			ROOT = node;
		}
		ComplexNumber getComplexNumbersAnswer() throws OverflowException{
			return getComplexNumbersAnswer(ROOT);
		}
		/*
			ÄAIÉAKKvZ·éB¶ÌtðTµÄA¶ÌqÌlðÛ¶µ½ãAEÌtðTµÄAEÌqÌlðÛ¶µ½lÆvZµÄeÉn·B
		*/
		ComplexNumber getComplexNumbersAnswer(CalculationNode root) throws OverflowException{
			final CalculationNode TEMPORARY_ROOT = root;
			
			ComplexNumber leftComplexNumber;
			CalculationNode temporaryNode;
			if((temporaryNode = TEMPORARY_ROOT.getLeftChild()) == null) {
			//	rightComplexNumber = TEMPORARY_ROOT.getComplexNumber();
				ComplexNumber result = TEMPORARY_ROOT.getComplexNumber();
				if(result.isOverflow()) {
					throw new OverflowException();
				}
				return result;
			} else {
				leftComplexNumber = getComplexNumbersAnswer(temporaryNode);
			}
			
			ComplexNumber rightComplexNumber;
		//	if((temporaryNode = TEMPORARY_ROOT.getRightChild()) == null) {	//nullÈç¶EÇ¿çànullÈÌÅAà¤àÇÁÄéB
		//		leftComplexNumber = TEMPORARY_ROOT.getComplexNumber();
		//	} else {
				temporaryNode = TEMPORARY_ROOT.getRightChild();
				rightComplexNumber = getComplexNumbersAnswer(temporaryNode);
		//	}
			
			ComplexNumber result = TEMPORARY_ROOT.calculate(leftComplexNumber, rightComplexNumber);
			if(result.isOverflow()) {
				throw new OverflowException();
			}
			return result;
		}
	}
	private class CalculationNode {
		private static final int PLUS = 1024;
		private static final int MULTIPLY = 1025;
		private static final int MINUS = 1023;
		
		private CalculationNode leftChild;
		private CalculationNode rightChild;
		private int operator;
		
		private ComplexNumber numbers;
		
		CalculationNode(CalculationNode left, CalculationNode right, int operator) {
			if(left == null || right == null) {
				throw new NullPointerException("CalculationNodeÌlªnull");
			}
			leftChild = left;
			rightChild = right;
			
			if(operator == PLUS || operator == MULTIPLY || operator == MINUS) {
				this.operator = operator;
			} else {
				String comment = "operatorÌlªs³F" + operator + "\t«·Èç" + PLUS + "\t|¯éÈç" + MULTIPLY +  "\tø­Èç" + MINUS;
				throw new IllegalArgumentException(comment);
			}
		}
		CalculationNode(int realNumber, int imaginaryNumber) {
			numbers = new ComplexNumber(realNumber, imaginaryNumber);
			
			leftChild = null;
			rightChild = null;
		}
		ComplexNumber calculate(ComplexNumber left, ComplexNumber right) {
			if(operator == PLUS) {
			//	System.out.print("vZF(" + left + ")+(" + right + ")=");
				ComplexNumber result = left.plus(right);
			//	System.out.println(result);
				return result;
			} else if(operator == MULTIPLY) {
			//	System.out.print("vZF(" + left + ")*(" + right + ")=");
				ComplexNumber result = left.multiply(right);
			//	System.out.println(result);
				return result;
			} else if(operator == MINUS) {
			//	System.out.print("vZF(" + left + ")-(" + right + ")=");
				ComplexNumber result = left.minus(right);
			//	System.out.println(result);
				return result;
			} else {
				throw new ArithmeticException("operatorÌlªs³:" + operator + "\t" + right + "\t" + left);
			}
		}
		ComplexNumber getComplexNumber() {
			return numbers;
		}
		CalculationNode getLeftChild() {
			return leftChild;
		}
		CalculationNode getRightChild() {
			return rightChild;
		}
		@Override
		public String toString() {
			if(leftChild == null && rightChild == null) {
				return numbers.toString();
			} else {
				return "Ôoµ½ éæ";
			}
		}
	}
	private class ComplexNumber {
		private int realNumber;
		private int imaginaryNumber;
		
		ComplexNumber(int realNumber, int imaginaryNumber) {
			this.realNumber = realNumber;
			this.imaginaryNumber = imaginaryNumber;
		}
		ComplexNumber plus(ComplexNumber another) {	//(a + bi) + (c + di) = (a + c) + (b + d)i
			realNumber = realNumber + another.getRealNumber();
			imaginaryNumber = imaginaryNumber + another.getImaginaryNumber();
			
			return this;
		}
		ComplexNumber multiply(ComplexNumber another) {	//(a + bi) * (c + di) = (ac - bd) + (ad + bc)i
			int thisRealNumber = realNumber;
			int thisImaginaryNumber = imaginaryNumber;
			int anotherRealNumber = another.getRealNumber();
			int anotherImaginaryNumber = another.getImaginaryNumber();
			
			realNumber = thisRealNumber * anotherRealNumber - thisImaginaryNumber * anotherImaginaryNumber;
			imaginaryNumber = thisRealNumber * anotherImaginaryNumber + thisImaginaryNumber * anotherRealNumber;
			
			return this;
		}
		ComplexNumber minus(ComplexNumber another) {	//(a + bi) - (c + di) = (a - c) + (b - d)i
			realNumber = realNumber - another.getRealNumber();
			imaginaryNumber = imaginaryNumber - another.getImaginaryNumber();
			
			return this;
		}
		boolean isOverflow() {
			if(realNumber < -10000 || 10000 < realNumber || imaginaryNumber < -10000 || 10000 < imaginaryNumber) {
				return true;
			} else {
				return false;
			}
		}
		private int getRealNumber() {
			return realNumber;
		}
		private int getImaginaryNumber() {
			return imaginaryNumber;
		}
		@Override
		public String toString() {
			if(realNumber != 0 && imaginaryNumber != 0) {
				if(imaginaryNumber < 0) {
					return Integer.toString(realNumber) + Integer.toString(imaginaryNumber) + ("i");
				} else {
					return Integer.toString(realNumber) + "+" + imaginaryNumber + "i";
				}
			} else if(realNumber != 0) {
				return Integer.toString(realNumber);
			} else if(imaginaryNumber != 0) {
				return imaginaryNumber + "i";
			} else {
				return "0";
			}
		}
	}
	private class OverflowException extends Exception {
		OverflowException() {
			super();
		}
	}
}
import java.io.BufferedReader;
import java.io.InputStreamReader;

//public class Problem1203_NapoleonsGrumble {
public class Main {
	private PalindromeList palindromeList;
	public static void main(String[] args) {
		try {
		//	Problem1203_NapoleonsGrumble test = new Problem1203_NapoleonsGrumble();
			Main test = new Main();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			int count = 0;
			String line;
			while((line = reader.readLine()) != null) {
				test.showAnswer(line);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	void showAnswer(String line) {
		palindromeList = new PalindromeList();
		setPalindrome(getCapitalCharArray(line));
		
		System.out.println(palindromeList);
	//	System.out.println("********");
	}
	char[] getCapitalCharArray(String text) {
		char[] originalCharArray = text.toCharArray();
		char[] capitalCharArray = new char[originalCharArray.length];
		
		int count = 0;
		int convertionGap = 'A' - 'a';
		for(int i = 0; i < originalCharArray.length; i++) {
			char character = originalCharArray[i];
			if('a' <= character && character <= 'z') {
				capitalCharArray[count] = (char)(character + convertionGap);
				count++;
			} else if('A' <= character && character <= 'Z') {
				capitalCharArray[count] = character;
				count++;
			}
		}
		
		char[] trimmedCapitalCharArray = new char[count];
		for(int i = 0; i < trimmedCapitalCharArray.length; i++) {
			trimmedCapitalCharArray[i] = capitalCharArray[i];
		}
	//	System.out.println("å¶»µ½àÌF" + new String(trimmedCapitalCharArray));
		return trimmedCapitalCharArray;
	}
	void setPalindrome(char[] charArray) {
		for(int i = 1; i < charArray.length-1; i++) {
			Palindrome candidate = getPalidrome(charArray, i-1, i+1);
			if(candidate != null) {
				palindromeList.add(candidate);
			}
			if(charArray[i] == charArray[i-1]) {
				candidate = getPalidrome(charArray, i-2, i+1);
				if(candidate != null) {
					palindromeList.add(candidate);
				}
			}
		}
	}
	private Palindrome getPalidrome(char[] charArray, int smallpoint, int largepoint) {
		int small = smallpoint;
		int large = largepoint;
		while(-1 < small && large < charArray.length) {
		//	System.out.println("ª¶ñF" + String.copyValueOf(charArray, small, large-small+1));
			if(charArray[small] == charArray[large]) {
		//		System.out.println("v");
			} else {
				if(large - small > 3) {		//forªÉæéÁªQÆAQ¶ÈºÍ³·éÆ¢¤âè¶Éæé
					break;
				} else {
					return null;	//ñ¶ÅÍÈ¢Æ¢¤±Æªª©Á½B
				}
			}
			small--;
			large++;
		}
		Palindrome result = createPalindrome(charArray, small+1, large-1);
	//	System.out.println("PalindromeóâF" + result);
		return result;
	}
	private Palindrome createPalindrome(char[] charArray, int start, int end) {
		char[] palindromeCharArray = new char[end - start + 1];
		for(int i = 0; i < palindromeCharArray.length; i++) {
			palindromeCharArray[i] = charArray[start+i];
		}
		return new Palindrome(palindromeCharArray);
	}
	private class PalindromeList {
		private final PalindromeNode LIST_HEAD;
		private PalindromeNode currentNode;
		
		PalindromeList() {
			LIST_HEAD = new PalindromeNode(new Palindrome(new char[0]));
			LIST_HEAD.setNext(LIST_HEAD);
			LIST_HEAD.setPrevious(LIST_HEAD);
			reset();
		}
		void reset() {
			currentNode = LIST_HEAD;
		}
		PalindromeNode getNextNode() {
			currentNode = currentNode.getNext();
			if(currentNode == LIST_HEAD) {
				return null;
			} else {
				return currentNode;
			}
		}
		boolean add(Palindrome target) {
			PalindromeNode duplicateNode = getDuplicateNode(target);
			if(duplicateNode == null) {
				insert(new PalindromeNode(target));
			} else {
				if(target.getLength() < duplicateNode.getData().getLength()) {	//³©ç é¨Ìûª·¯êÎ»ÌÜÜ
					return false;//dont add
				} else {	//³©ç é¨ÌûªZ©¯êÎXV
					remove(duplicateNode);
					insert(new PalindromeNode(target));
				}
			}
			return true;
		}
		void remove(PalindromeNode node) {
			node.getPrevious().setNext(node.getNext());
			node.getNext().setPrevious(node.getPrevious());
		}
		/**
			øÆ¯¶©A»êðàï·éPalindromeNode@yÑAøÉàï³êéPalindromeNode ª éê»ÌÎÛðÔ·B
			È¯êÎnullðÔ·
		*/
		private PalindromeNode getDuplicateNode(Palindrome target) {
			reset();
			PalindromeNode comparison = getNextNode();
			
			while(comparison != null) {
			//	System.out.println("³F" + target + "ärÎÛF" + comparison.getData());
				if(comparison.getData().isOverlap(target)) {
					return comparison;
				} else {
					comparison = getNextNode();
				}
			}
			return null;
		}
		private void insert(PalindromeNode node) {
			node.setPrevious(LIST_HEAD.getPrevious());
			node.setNext(LIST_HEAD);
			node.getPrevious().setNext(node);
			LIST_HEAD.setPrevious(node);
		}
		@Override
		public String toString() {
			StringBuilder resultBuilder = new StringBuilder();
			reset();
			PalindromeNode node = getNextNode();
			while(node != null) {
				resultBuilder.append(node.getData());
				resultBuilder.append(" ");
				node = getNextNode();
			}
			int stringLength = resultBuilder.length();
			if(stringLength > 0) {
				resultBuilder.deleteCharAt(stringLength-1);
			}
			
			return resultBuilder.toString();
		}
		private class PalindromeNode {
			private Palindrome data;
			private PalindromeNode next;
			private PalindromeNode previous;
			
			PalindromeNode(Palindrome data) {
				this.data = data;
				next = null;
				previous = null;
			}
			void setNext(PalindromeNode next) {
				this.next = next;
			}
			void setPrevious(PalindromeNode previous) {
				this.previous = previous;
			}
			Palindrome getData() {
				return data;
			}
			PalindromeNode getNext() {
				return next;
			}
			PalindromeNode getPrevious() {
				return previous;
			}
		}
	}
	private class Palindrome {
		private char[] content;
		
		Palindrome(char[] palindrome) {
			if(isPalindrome(palindrome)) {
				content = palindrome;
			} else {
				throw new IllegalArgumentException(new String(palindrome));
			}
		}
		private boolean isPalindrome(char[] array) {
			int low = 0;
			int high = array.length-1;
			
			while(low <= high) {
				if(array[low] == array[high]) {
					//do more
				} else {
					return false;
				}
				low++;
				high--;
			}
			return true;
		}
		char[] getContent() {
			return content;
		}
		int getLength() {
			return content.length;
		}
		boolean isOverlap(Palindrome another) {
			char[] largeArray;
			char[] smallArray;
			if(getLength() == another.getLength()) {
				int length = getLength();
				largeArray = getContent();
				smallArray = another.getContent();
				for(int i = 0; i < length; i++) {
					if(largeArray[i] == smallArray[i]) {
						//check more
					} else {
						return false;
					}
				}
				return true;
			} else if(getLength() < another.getLength()) {
				largeArray = another.getContent();
				smallArray = getContent();
			} else {
				largeArray = getContent();
				smallArray = another.getContent();
			}
			if(largeArray.length - smallArray.length == 1) {
				return false;
			}
			for(int i = 1; i < largeArray.length - smallArray.length; i++) {
				for(int j = 0; j < smallArray.length; j++) {
				//	System.out.println("ärF" + smallArray[j] + largeArray[j+i]);
					if(smallArray[j] == largeArray[j+i]) {
						if(j == smallArray.length-1) {
							return true;
						} else {
							//check more
						}
					} else {
						break;
					}
				}
			}
			return false;
		}
		@Override
		public String toString() {
			return new String(content);
		}
	}
}
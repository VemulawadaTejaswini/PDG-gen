import java.io.BufferedReader;
import java.io.InputStreamReader;

class CaesarCipher {

	public String encrypt(String exactWords){
		String encryption = "";
		String[] words = exactWords.split(" ");
		int numWords = words.length;
		for(int iWords = 0; iWords < numWords; iWords++){
			for(char e : words[iWords].toCharArray()){
				if(e == '.'){
					encryption = encryption + e;
				} else {
					encryption = encryption + (char)(e + 1);
				}
			}
			encryption = encryption + ' ';
		}
		return encryption;
	}

	public String decode(String encryptWords){
		String decodedWords = "";
		String[] words = encryptWords.split(" ");
		int numWords = words.length;
		int shift = 0;
		for(int iWords = 0; iWords < numWords; iWords++){
			if(words[iWords].length() == 3){
				shift = 't' - words[iWords].charAt(0);
				if((char)(words[iWords].charAt(1) + shift) == 'h' && (char)(words[iWords].charAt(2) + shift) == 'e'){
					break;
				}
			} else if(words[iWords].length() == 4){
				shift = 't' - words[iWords].charAt(0);
				if((char)(words[iWords].charAt(1) + shift) == 'h' && (char)(words[iWords].charAt(2) + shift) == 'i' &&
						(char)(words[iWords].charAt(3) + shift) == 's'){
					break;
				} else
				if((char)(words[iWords].charAt(1) + shift) == 'h' && (char)(words[iWords].charAt(2) + shift) == 'a' &&
						(char)(words[iWords].charAt(2) + shift) == 't'){
					break;
				}
			}
		}

		for(int iWords = 0; iWords < numWords; iWords++){
			for(char e : words[iWords].toCharArray()){
				if(e == '.'){
					decodedWords = decodedWords + e;
				} else {
					decodedWords = decodedWords + (char)(e + shift);
				}
			}
			decodedWords = decodedWords + ' ';
		}

		return decodedWords;
	}

	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		CaesarCipher caesarCipher = new CaesarCipher();
		while(true){
			try{
				String buf = br.readLine();
				if(buf == null) break;
				if(buf.length() > 80)	break;

				System.out.println(caesarCipher.decode(buf));
			}catch(Exception e){
				System.out.print(e);
				break;
			}
		}
	}
}
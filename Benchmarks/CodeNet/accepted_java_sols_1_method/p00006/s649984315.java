import java.util.Scanner;

class Main{
    public static void main(String[] a){
			Scanner input = new Scanner(System.in);
			String OrigWord = input.nextLine();
			int OrigLen = OrigWord.length(); 
			String NewWord = "";
			for (int x=OrigLen-1; x >= 0; x--){
				
				NewWord = NewWord + (OrigWord.charAt(x)); 
				
			}
						
			System.out.println(NewWord);
		    input.close();
	}

}
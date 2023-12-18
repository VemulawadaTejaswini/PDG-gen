import java.util.Scanner;

class Main{

    public static void main(String args[]){
    	Scanner scan = new Scanner(System.in);
    	String str = scan.nextLine();		//ツ嘉アツづィツつュツづつ「...
    	String word[] = str.split(" ");
    	String LongWord = word[0];
    	int count[]=new int [word.length];
    	int maxCount=0;
    	String maxCountWord = word[0];
    	
    	for(int i=0;i<word.length;i++){		//ツつアツづェツづ債配ツ療アツづ個陳キツつウ
    		for(int j=0;j<word.length;j++){					//ツつアツづェツづ債閉カツ篠堋療アツづ個陳キツつウ
    			if(word[i].equals(word[j]) && i!=j && word[i].length()!=0){
    				count[i]++;
					word[j]=new String();	//ツ凝ウツづ可つオツづ、ツ重ツ閉。ツづーツ防ツつョツ。
    			}
    		}
    		maxCountWord = maxCount<count[i] ? word[i] : maxCountWord;
    		LongWord = LongWord.length()<word[i].length() ? word[i] : LongWord;
    	}
    	System.out.println(maxCountWord + ' ' + LongWord);
    }
}
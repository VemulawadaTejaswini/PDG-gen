import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String tmpStr;
        int tmpNum = 0;
        int[] alphaNum = new int[26];
        char alphaC = 'A';
            
        while (scan.hasNext()){
            tmpStr = scan.next().toLowerCase();
            for(int i=0; i<tmpStr.length(); i++){
                tmpNum=tmpStr.charAt(i)-'a';
                if(0<=tmpNum && tmpNum<='z'-'a')
                    alphaNum[tmpNum]++;
            }
        }
        
        for(int i=0; i<26; i++)
            System.out.println((char)('a'+i)+" : "+alphaNum[i]);
    }
}


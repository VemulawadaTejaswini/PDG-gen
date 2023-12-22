import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            char[] ch = new char[1200];
            int n = 0;
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                line = line.toLowerCase();
                for(int i = 0; i < line.length(); i++){
                    ch[i + n] = line.charAt(i);
                }
                n += line.length(); 
            }
            int[] al = new int[26];
            for(int j = 0; j < 26; j++){
                al[j] = 0;
            }
            for(int j =0; j < n; j++){
                for(int k = 0; k < 26;k++){
                    if((int)ch[j] - (k + 97) == 0){
                        al[k] ++;
                    }
                }
            }
            for(int j = 0; j < 26; j++){
                System.out.printf("%c : %d\n",(97 + j),al[j]);
            }
            scanner.close();
        
    }
}

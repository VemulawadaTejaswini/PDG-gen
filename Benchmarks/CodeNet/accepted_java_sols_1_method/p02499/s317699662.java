import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        InputStreamReader isr =new InputStreamReader(System.in);
   		BufferedReader reader =new BufferedReader(isr);
    	String line = reader.readLine();
        
        int[] count = new int[26];
        
        while(line != null) {
            line = line.toLowerCase();
            int i;
            for(i = 0;i < line.length();i++) {
                if(Character.isLetter(line.charAt(i)))
                    count[line.charAt(i) - 'a']++;
            }
            line = reader.readLine();
        }
        
        char c;
        for (c = 'a';c <= 'z';c++) {
            System.out.println(c + " : " + count[c - 'a']);
        }
    }
}
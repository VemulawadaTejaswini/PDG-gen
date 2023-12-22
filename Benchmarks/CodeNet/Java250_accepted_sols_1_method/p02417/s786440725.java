import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] count = new int[26];
        
        while(sc.hasNext()){
            String line  = sc.next();
            
            for(int i = 0; i < line.length(); i++){
                if(Character.isLowerCase(line.charAt(i))){
                    ++count[line.charAt(i) - 'a'];
                }
                
                else if(Character.isUpperCase(line.charAt(i))){
                    ++count[line.charAt(i) - 'A'];
                }
            }
        }
        
        for(int i = 0; i < count.length; i++){
            System.out.println((char)('a' + i) + " : " + count[i]);
        }
    }
}

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        String input="";
        char[] text=new char[1000];
        
        while(true){
            String in;
            
            in=scan.nextLine();
            if(in.equals("")){break;}
            else{input+=in;}            
        }
        
        text=input.toCharArray();
        
        for(int i=97;i<=122;i++){
            int count=0;
            for(int j=0;j<text.length;j++){
                if(text[j]==(char)(i)){
                    count+=1;
                }
            }
            System.out.println((char)(i)+":"+count);
        }
        
    }
}